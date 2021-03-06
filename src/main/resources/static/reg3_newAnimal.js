// SELLER OPTIONS
const animalTypeOptionSeller = document.getElementById("animalTypeOptionSeller");
const chippedOption = document.getElementById("chippedOption");
const vaccinatedOption = document.getElementById("vaccinatedOption");
const childFriendlyOption = document.getElementById("childFriendlyOption");
const isSterilizedOption = document.getElementById("isSterilizedOption");
const isFemaleOption = document.getElementById("isFemaleOption");
// const isActiveOption = document.getElementById("isActiveOption");

animalTypeOptionSeller.value = "DOG";
chippedOption.value = true;
vaccinatedOption.value = true;
childFriendlyOption.value = true;
isSterilizedOption.value = true;
isFemaleOption.value = true;
// isActiveOption.value = true;


function editImgClass(item){
    item.className = "optionImg imgOption";
}


const dogSeller = document.getElementById("DOGSELLER");
const catSeller = document.getElementById("CATSELLER");
const animalOption = document.getElementById("animalOption");

animalOption.addEventListener("click", (event) => {
    const type = event.target.id;
    animalTypeOptionSeller.value = type.substring(0,3);
});

dogSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg imgActiveOption";
    event.target.src = "image/dogIcon.png";
    catSeller.src = "image/catIconGrey.png";
    editImgClass(catSeller);
});

catSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg imgActiveOption";
    event.target.src = "image/catIcon.png";
    dogSeller.src = "image/dogIconGrey.png";
    editImgClass(dogSeller);
});


// Chipped
const yesChipped = document.getElementById("yesChipped");
const noChipped = document.getElementById("noChipped");

yesChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    chippedOption.value = true;
    noChipped.className = "option";
});

noChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    chippedOption.value = false;
    yesChipped.className = "option";
});

// Vaccinated
const yesVaccinated = document.getElementById("yesVaccinated");
const noVaccinated = document.getElementById("noVaccinated");

yesVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    vaccinatedOption.value = true;
    noVaccinated.className = "option";
});

noVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    vaccinatedOption.value = false;
    yesVaccinated.className = "option";
});

// Childfriendly
const yesChildfriendly = document.getElementById("yesChildfriendly");
const noChildfriendly = document.getElementById("noChildfriendly");

yesChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    childFriendlyOption.value = true;
    noChildfriendly.className = "option";
});

noChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    childFriendlyOption.value = false;
    yesChildfriendly.className = "option";
});

// Sterilized
const yesSterilized = document.getElementById("yesSterilized");
const noSterilized = document.getElementById("noSterilized");

yesSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isSterilizedOption.value = true;
    noSterilized.className = "option";
});

noSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isSterilizedOption.value = false;
    yesSterilized.className = "option";
});

// Gender
const female = document.getElementById("female");
const male = document.getElementById("male");

female.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isFemaleOption.value = true;
    male.className = "option";
});

male.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    isFemaleOption.value = false;
    female.className = "option";
});