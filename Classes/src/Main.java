public static class main(){
    public static void calc()
}
static double execute(char opcode, double a, double b){
    double result;
    switch (opcode){
        case opcode = 'a':
            result = a+b;
            break;
        case opcode = 's':
            result = a-b;
            break;
        case opcode = 'm':
            result = a*b;
            break;
        case opcode = 'd':
            result = a/b;
            break;
        }
        return result;
    }