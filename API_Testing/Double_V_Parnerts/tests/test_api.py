import requests
import json
#from config.config import BASE_URL

BASE_URL = 'https://fakestoreapi.com'
##Comenzar con los casos de prueba
def test_get_products_electronics():
    print(" Productos que son de la categoria electronics")
    response = requests.get(f'{BASE_URL}/products')
    print("Ruta GET_ALL: ", response.url)
    #Verifica que muestre un estatus 200
    assert response.status_code == 200
    data = response.json()
    #Verifica que el resultado es una lista de elementos
    assert isinstance (data, list)
    #Verifica si trae resultados
    assert len(data)>0
    #Verificar si contiene elementos de categorya electronics
    electronics = 0;
    for categoria in data:
        if categoria["category"] == "electronics":
            #Verificar que el post contenga el campo titulo
            assert "title" in categoria
            print (categoria["title"])
            electronics+=1
    print(" Total de articulos de categoria electronics: ",electronics)
    #Verifica que que hay elementos de la category electronics
    assert electronics > 0
    
#Obtener un producto en especifico
def test_get_single_product():
    product_id= 2
    response = requests.get(f'{BASE_URL}/products/{product_id}')
    print("\nRuta GET: ", response.url)
    #verificar el estatus
    assert response.status_code == 200
    data = response.json()
    #Verificar que el id que estoy obteniendo sea el correcto de mi producto
    assert data["id"] == product_id
    #Verificar el precio del producto
    assert data["price"]  == 22.3
    #Verificar el cantidad del producto
    assert data["rating"]["count"]
    print(" Resultado obtenido", data)

#Crear un producto
def test_create_product():
    #json que pide el api
    payload = {
        "id": 25,
        "title": "Mi producto",
        "price": 250.25,
        "description": "Este es un producto dado de alta desde mi prueba de API",
        "category": "electronics",
        "image": "https://www.ovhcloud.com/sites/default/files/styles/large_screens_1x/public/2022-05/whatis_rest_api.png"    
    }
    #realizar la peticion
    response = requests.post(f'{BASE_URL}/products/',json=payload)
    print("\n Ruta POST: ", response.url)
    #verificar la respuesta con un estatus 201
    assert response.status_code == 201
    #Verificar datos del producto que he creado
    data = response.json()
    assert data["title"]== payload["title"] 
    #verificar que existan datos del producto creado
    assert "id" in data
    assert "title" in data
    assert "price" in data
    assert "description" in data
    print("Producto creado: ",data)

#Url de nueva imagen.  https://nexwebsites.com/images/blog/api.png
#Actualizar la imagen de un producto
def test_update_producto():
    product_id = 5
    payload = {
        "id": 25,
        "title": "Mi producto actualizado",
        "price": 500.99,
        "description": "Este es producto fue actualizado desde mi Test",
        "category": "electronics",
        "image": "https://nexwebsites.com/images/blog/api.png"    
    }

    response = requests.put(f'{BASE_URL}/products/{product_id}',json=payload)
    print("\n Ruta PUT: ", response.url)
    #Verificar que nos regresa un estatus 200
    assert response.status_code == 200
    data = response.json()
    #Comprobar la respuesta que los datos se han modificado
    assert data ["title"] == payload["title"]
    assert data ["price"] == payload["price"]
    assert data ["description"] == payload["description"]
    assert data ["image"] == payload["image"]
    print(" Producto actualizado : ",data)
    
#Eliminar un producto
def test_delete_product():
     product_id = 16
     response = requests.delete(f'{BASE_URL}/products/{product_id}')
     print("\n Ruta DELETE: ", response.url)
     #Validar codigo de respuesta
     assert response.status_code == 200
     print(f'Usuario eliminado: {product_id}')

