public class ContaMagica { 
    public static final int SILVER = 0; 
    public static final int GOLD = 1; 
    public static final int PLATINUM = 2;
    private double saldo; 
    
    public ContaMagica(){
        this.saldo = 0.0;
    }
    
    public double getSaldo(){
        if(getStatus() == SILVER){
            return saldo;
        }
        else if(getStatus() == GOLD){
            return saldo / 100;
        }
        else{
            return (saldo * 2.5)/100;
        }
    }

    public int getStatus(){
        if(saldo < 50000.0){
            return SILVER;
        }
        else if(saldo >= 50000.0 && saldo < 200000.0){
            return GOLD;
        }
        else{
            return PLATINUM;
        }
    }

    public void deposito(double valor) throws INVALID_OPER_EXCEPTION{
        if(valor < 0.0 || valor >= 150000.0){
            throw new INVALID_OPER_EXCEPTION("Inválido!");
        }
        else{
            saldo += valor;
        }
    }
    public void retirada(double valor) throws INVALID_OPER_EXCEPTION{
        if(valor > saldo || valor >= 150000.0){
            throw new INVALID_OPER_EXCEPTION("Inválido!");
        }
        else{
            saldo -= valor;
        }
    }