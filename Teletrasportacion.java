en NaveDeAtaque


     public void act() {
    if (isTouching(Asteroide.class)) {
        // Teletransportar la nave a un nuevo mundo espacial
        teletransportar1();
        teletransportar2();
        teletransportar3();
    } else {
        // Aquí puedes agregar el código para mover la nave
         // Llama a un método que maneje el movimiento de la nave
    }
}

public void LLegarAlPunto() {
    Asteroide asteroide = (Asteroide) getOneIntersectingObject(Asteroide.class);
    if (asteroide != null) {
        teletransportar1();
       teletransportar2();
       teletransportar3();
      
      
    } else {
        //hay que poner el movimiento de la nave
    }
}


public void teletransportar1() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

    getWorld().setBackground(new GreenfootImage("fondo.png"));
     getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     
     
     //Greenfoot.playSound("teleport"); 
     
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}
    
    
    public void teletransportar2() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

    getWorld().setBackground(new GreenfootImage("pepe.png"));
     getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     //Greenfoot.playSound("teleport"); 
     
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}
    
    public void teletransportar3() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

    getWorld().setBackground(new GreenfootImage("space.png"));
     getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     //Greenfoot.playSound("teleport"); 
    
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}
    
 
