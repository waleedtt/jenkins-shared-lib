def call(name){
    echo "Hey ${name} how are you"
}

def myFunction(name){
    echo "Hey ${name} how are you from myfunction"
}


def myFunctionMap(Map person = [:]){
    echo "Hey ${person.name} , testing map ${person.status}"
}


class Greeter{
    public static void sayHello(){
        System.out.println("Hello Person")
        return "i am the hero"
    } 
}


def aLocalFunction(i,k) {
    return i+k
}

def aLocalFunction1(i) {
    i+i
}

def aLocalFunctionOneArg(i) {
    i+i
}

def aLocalFunctionTwoArg(i,k) {
    i+k
}

def myCLassFunction(){
    def foo = 6.5
    echo "with something: ${foo} ${foo.class}"
    foo = "a string"
    echo "with something: ${foo} ${foo.class}"

    echo "aLocalFunction(4,6): ${aLocalFunction(4,6)}"
    echo "aLocalFunction(tom,harry): ${aLocalFunction("tom","harry")}"
    
    echo "aLocalFunction1(5): ${aLocalFunction1(5)}"
    echo "aLocalFunction1 5: ${aLocalFunction1 5}"

    echo "aLocalFunctionOneArg 5: ${aLocalFunctionOneArg 5 }"
    echo "aLocalFunctionTwoArg 5 5: ${aLocalFunctionTwoArg 5,5}"

    echo "aLocalFunctionTwoArg aLocalFunctionOneArg(5), 5: ${aLocalFunctionTwoArg aLocalFunctionOneArg(5), 5}"

    Greeter greet = new Greeter()
    myvaribale = greet.sayHello()
    echo "with something: ${myvaribale}"
    echo greet.sayHello()
    // echo test
    //echo "Hey ${name} how are you from myfunction"
}


def callOther(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}