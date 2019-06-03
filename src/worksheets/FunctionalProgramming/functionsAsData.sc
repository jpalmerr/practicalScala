// functions as date => arguments

val cube = (n: Int) => n*n*n

def doIt(n: Int, f: Int => Int) = f(n)

doIt(3, cube)