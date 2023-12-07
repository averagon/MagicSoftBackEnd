const conjuntoCard = document.getElementById("cards_servicios")
const services = JSON.parse(localStorage.getItem("services"));

const URL_MAIN='/api/servicios/'; 
function addCard(cards,promps){
	fetch(URL_MAIN,{
		method:'get'
		}).then( (response)=>{
        response.json()
        .then( (res)=>{
			console.log(res);
			console.log(res.length);
			productos=res;
			Array.from(json).forEach((p,index)=>{
				cards.innerHTML += ` 
    <div class="col">
          <div class="card">
            <div class="card text-dark card-has-bg click-col" style="background-image:url('${p.imagen}');">
              <div class="card-img-overlay d-flex flex-column">
                <div class="card-body">
                  <h4 class="card-title mt-0 "><a class="text-dark" herf="./contacto.html">${p.nombre}</a></h4>
                  <p>${p.descripcion}</p>
                </div>
              </div>
            </div>
          </div>
        </div>`;
			}); //for each
			}); //then
			}).catch(function(error){
				console.log("Problema en el JSON", error)
    });
    	console.log(document.getElementById("cards_servicios"));
    }
    
