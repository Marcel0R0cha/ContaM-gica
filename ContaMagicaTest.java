public class ContaMagicaTest{

    @Test
    public void depositoTest(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(51000);
        assertEquals(0, cm.getStatus();
    }


    
    @Test
    public void depositoTest2(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(49000);
        assertEquals(1, cm.getStatus();
    }

    @Test
    public void depositoTest3(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(201000);
        assertEquals(2, cm.getStatus());

    }


    @Test
    public void depositoTest4(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(51000);
        cm.deposito(1000);
        assertEquals(cm.getSaldo(), 52010);
    }

    @Test
    public void depositoTest5(){       
        ContaMagica cm = new ContaMagica();
        cm.deposito(20000);
        cm.deposito(1000);
        assertEquals(cm.getSaldo(), 21000);
    }

    @Test
    public void depositoTest6(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(51000);
        cm.deposito(150000);
        cm.deposito(1000);        
        assetEquals(cm.getSaldo(),203525);
    }


    @Test
    public void retirada1(){
        ContaMagica cm  = new ContaMagica();
        cm.deposito(51000);
        cm.deposito(150000);
        cm.deposito(1000); 

        cm.retirada(103526);
        assertEquals(1,cm.getStatus())
    }

    @Test
    public void retirada2(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(51000);
        cm.deposito(1000);
        cm.retirada(27011);

        assetEquals(0, cm.getStatus);
    }



    @Test
    public void retirada3(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(20000);
        cm.retirada(1000);
        assertEquals(0,cm.getStatus());
    }


    @Test
    public void retirada4(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(51000);
        cm.deposito(150000);
        cm.deposito(1000); 
        cm.retirada(200000);
        
        assertEquals(2,cm.getStatus());
    }

    
    @Test
    public void retiradaNegativo(){
        
        ContaMagica cm = new ContaMagica();
        cm.deposito(10000);
        cm.retirada(11000);
        
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Valor Invalido");
        });

        assertEquals("Valor Invalido",exception.getMessage());
        assertEquals(10000, cm.getSaldo());


    }


    @Test
    public void retiradaNegativo2(){
        
        ContaMagica cm = new ContaMagica();
        cm.deposito(1000);
        cm.deposito(-1);
        
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Valor Invalido");
        });

        assertEquals("Valor Invalido",exception.getMessage());
        assertEquals(1000, cm.getSaldo());


    }


    @Test
    public void retiradaNegativo3(){
        
        ContaMagica cm = new ContaMagica();
        cm.deposito(1000);
        cm.retirada(-1);
        
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Valor Invalido");
        });

        assertEquals("Valor Invalido",exception.getMessage());
        assertEquals(1000, cm.getSaldo());


    }
    




    

}