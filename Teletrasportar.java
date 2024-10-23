// primer metodo

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


// segundo metodo 
public void LLegarAlPunto() {
    Asteroide asteroide = (Asteroide) getOneIntersectingObject(Asteroide.class);
    if (asteroide != null) {
        teletransportar1();
    } else {
        // Aquí puedes agregar el código para mover la nave
         // Llama a un método que maneje el movimiento de la nave
    }
}

// tercer metodo sobre el teletransporte 1
public void teletransportar1() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

   getWorld().setBackground(new GreenfootImage("fondo.png"));
    getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     
     
   Greenfoot.playSound("engine-on.wav"); 
     
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}

//cuarto metodo sobre el teletransporte 2 
    public void teletransportar2() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

    getWorld().setBackground(new GreenfootImage("pepe.png"));
     getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     Greenfoot.playSound("engine-on.wav"); 
     
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}
    //quinto metodo sobre el teletransporte 3 
    public void teletransportar3() {
    // Generar un nuevo mundo espacial aleatorio
    int newX = Greenfoot.getRandomNumber(600); // Ancho del mundo espacial
    int newY = Greenfoot.getRandomNumber(400); // Alto del mundo espacial

    // Teletransportar la nave a la nueva posición
    setLocation(newX, newY);

    getWorld().setBackground(new GreenfootImage("space.png"));
     getWorld().addObject(new Explosion(), getX(), getY()); // Agregar un efecto de explosión
     Greenfoot.playSound("engine-on.wav"); 
    
     //getWorld().setBackground(new GreenfootImage("space.png"));// Reproducir un sonido de teletransporte
}
    
 
    
