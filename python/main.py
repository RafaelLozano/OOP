from car import Car #importa la clase.

if __name__ == "__main__":
    print("Hola mundo")
    carro = Car()
    carro.driver = "Rafa"
    carro.license = "M56RJ"
    print(vars(carro))
