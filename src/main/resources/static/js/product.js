const conjuntoCard = document.getElementById("cards_servicios")
const services = JSON.parse(localStorage.getItem("services"));

function addCard(cards,promps){
    const titulo = promps['nombre']
    const img = promps['urlImage']
    const descripcion = promps['descripción']

    const templateCard = ` 
    <div class="col">
          <div class="card">
            <div class="card text-dark card-has-bg click-col" style="background-image:url('${img}');">
              <div class="card-img-overlay d-flex flex-column">
                <div class="card-body">
                  <h4 class="card-title mt-0 "><a class="text-dark" herf="./contacto.html">${titulo}</a></h4>
                  <p>${descripcion}</p>
                </div>
              </div>
            </div>
          </div>
        </div>`;
    cards.innerHTML += templateCard;


}
if(services !== null){
  services.forEach(service => {
    console.log(service);
    addCard(conjuntoCard, service); 
  });//services forEach
} else {
  console.log("No se tienen servicios en el localStorage");
}


const promps = {
  nombre: "Distribución de equipo de cómputo.",
  urlImage: "./src/img/imagen1.avif",
  descripción: "Equipo de cómputo centralizado y descentralizado. Infraestructura de redes y accesorios periféricos."
}
addCard(conjuntoCard,promps)

const promps2 = {
  nombre: "Distribución de licencias de software",
  urlImage: "./src/img/imagen2.avif",
  descripción: "Integramos nuestras soluciones con licencias de sistema operativo nivel enterprise (Windows, RHEL). Software de diseño gráfico, arquitectónico y de ingeniería (Autodesk, Adobe)." 
}
addCard(conjuntoCard,promps2)

const promps3 = {
  nombre: "Servicios en la nube.",
  urlImage: "./src/img/imagen3.jpeg",
  descripción: "Servicios en la nube (Azure, AWS, Google Cloud)." 
}
addCard(conjuntoCard,promps3)

const promps4 = {
  nombre: "Desarrollo de Software a la medida.",
  urlImage: "./src/img/desarrollo.jpg",
  descripción: "Utilizamos metodologías ágiles y alcanzamos un alto nivel de madurez de acuerdo con la certificación internacional CMMi DEV5." 
}
addCard(conjuntoCard,promps4)

const promps5 = {
  nombre: "Servicios finacieros. Arrendamiento",
  urlImage: "./src/img/financieros.jpg",
  descripción: "Esta es la estrategia ideal para la renovación constante de tu infraestructura de TI y amortizar el costo financiero de la inversión inicial." 
}
addCard(conjuntoCard,promps5)

const promps6 = {
  nombre: "Servicios administrados.",
  urlImage: "./src/img/servicios.jpg",
  descripción: "Administramos y mantenemos tu red, almacenamiento de datos,seguridad informática, gestión de base de datos y soporte técnico." 
}
addCard(conjuntoCard,promps6)

const promps7 = {
  nombre: "SLA",
  urlImage: "./src/img/imagen7.jpeg",
  descripción: "Ofrecemos acuerdos de nivel de servicio (SLA) que garantizan un alto rendimiento y disponibilidad de los servicios." 
}
addCard(conjuntoCard,promps7)

const promps8 = {
  nombre: "Diseño de Arquitectura de sistemas",
  urlImage: "./src/img/arq.jpeg",
  descripción: "Nos adaptamos a las necesidades y presupuesto de tu organización para planificar estratégicamente la infraestructura de IT, ya sea para cómputo centralizado o cómputo descentralizado." 
}
addCard(conjuntoCard,promps8)

const promps9 = {
  nombre: "Implementación de Software de Caja",
  urlImage: "./src/img/imagen9.jpeg",
  descripción: "Adaptamos software de tipo ERP y CRM a las necesidades de ttu empresa." 
}
addCard(conjuntoCard,promps9)

const promps10 = {
  nombre: "Servicios Administrativos de la OnSite",
  urlImage: "./src/img/imagen10.jpeg",
  descripción: "Junto con los servicios en la nube, le proveemos del servicio de administración de esta desde su empresa." 
}
addCard(conjuntoCard,promps10)


