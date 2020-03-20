const animalTypeOption = document.getElementById("animalTypeOption");
const homeTypeOption = document.getElementById("homeTypeOption");
const previousAnimalOption = document.getElementById("previousAnimalOption");
const hasChildrenOption = document.getElementById("hasChildrenOption");

animalTypeOption.value = "DOG";
homeTypeOption.value = "APARTMENT";
previousAnimalOption.value = true;
hasChildrenOption.value = true;

function editImgClass(item){
    item.className = "optionImg option";
}


// Animal type
const dog = document.getElementById("DOG");
const cat = document.getElementById("CAT");
const animalOption = document.getElementById("animalOption");

animalOption.addEventListener("click", (event) => {
    const type = event.target.id;
    animalTypeOption.value = type;
});

dog.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/dogIcon.png";
    cat.src = "image/catIconGrey.png";
    editImgClass(cat);
});

cat.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/catIcon.png";
    dog.src = "image/dogIconGrey.png";
    editImgClass(dog);
});


// House / Apartment
const apartment = document.getElementById("APARTMENT");
const house = document.getElementById("HOUSE");
const homeType = document.getElementById("homeType");

homeType.addEventListener("click", (event) => {
    const type = event.target.id;
    homeTypeOption.value = type;
});

apartment.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    house.className = "option";
});

house.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    apartment.className = "option";
});


// Previous animal owner
const yesPrevious = document.getElementById("yesPrevious");
const noPrevious = document.getElementById("noPrevious");

yesPrevious.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    previousAnimalOption.value = true;
    noPrevious.className = "option";
});

noPrevious.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    previousAnimalOption.value = false;
    yesPrevious.className = "option";
});


// Has children
const yesChildren = document.getElementById("yesChildren");
const noChildren = document.getElementById("noChildren");

yesChildren.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    hasChildrenOption.value = true;
    noChildren.className = "option";
});

noChildren.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    hasChildrenOption.value = false;
    yesChildren.className = "option";
});
