const userTypeOption = document.getElementById("userTypeOption");
const animalTypeOption = document.getElementById("animalTypeOption");
const homeTypeOption = document.getElementById("homeTypeOption");
const previousAnimalOption = document.getElementById("previousAnimalOption");
const hasChildrenOption = document.getElementById("hasChildrenOption");
const genderOption = document.getElementById("genderOption");
const chippedOption = document.getElementById("chippedOption");
const vaccinatedOption = document.getElementById("vaccinatedOption");
const childFriendlyOption = document.getElementById("childFriendlyOption");
const isSterilizedOption = document.getElementById("isSterilizedOption");

function editTextClass(item){
    item.className = "option";
}

function editImgClass(item){
    item.className = "optionImg option";
}

function changeFormValues(item, value) {
    item.value = value;
}

const buyer = document.getElementById("buyer");
const seller = document.getElementById("seller");
const buyerOptions = document.getElementById("buyerOptions");
const sellerOptions = document.getElementById("sellerOptions");

buyer.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    buyerOptions.className = "showOptions";
    sellerOptions.className = "hideOptions";
    editTextClass(seller);
    changeFormValues(userTypeOption, "BUYER");
});

seller.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    buyerOptions.className = "hideOptions";
    sellerOptions.className = "showOptions";
    editTextClass(buyer);
    changeFormValues(userTypeOption, "SELLER");
});


const dog = document.getElementById("dog");
const cat = document.getElementById("cat");

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


const apartment = document.getElementById("apartment");
const house = document.getElementById("house");

house.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(apartment);
});

apartment.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(house);
});


const yesPrevious = document.getElementById("yesPrevious");
const noPrevious = document.getElementById("noPrevious");

yesPrevious.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noPrevious);
});

noPrevious.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesPrevious);
});


const yesChildren = document.getElementById("yesChildren");
const noChildren = document.getElementById("noChildren");

yesChildren.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noChildren);
});

noChildren.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesChildren);
});


const female = document.getElementById("female");
const male = document.getElementById("male");

female.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(male);
});

male.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(female);
});



// SELLER OPTIONS

const dogSeller = document.getElementById("dogSeller");
const catSeller = document.getElementById("catSeller");

dogSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/dogIcon.png";
    catSeller.src = "image/catIconGrey.png";
    editImgClass(catSeller);
});

catSeller.addEventListener("click", (event) => {
    event.target.className = "optionImg activeOption";
    event.target.src = "image/catIcon.png";
    dogSeller.src = "image/dogIconGrey.png";
    editImgClass(dogSeller);
});


const yesChipped = document.getElementById("yesChipped");
const noChipped = document.getElementById("noChipped");

yesChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noChipped);
});

noChipped.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesChipped);
});


const yesVaccinated = document.getElementById("yesVaccinated");
const noVaccinated = document.getElementById("noVaccinated");

yesVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noVaccinated);
});

noVaccinated.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesVaccinated);
});


const yesChildfriendly = document.getElementById("yesChildfriendly");
const noChildfriendly = document.getElementById("noChildfriendly");

yesChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noChildfriendly);
});

noChildfriendly.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesChildfriendly);
});


const yesSterilized = document.getElementById("yesSterilized");
const noSterilized = document.getElementById("noSterilized");

yesSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(noSterilized);
});

noSterilized.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(yesSterilized);
});


const femaleSeller = document.getElementById("femaleSeller");
const maleSeller = document.getElementById("maleSeller");

femaleSeller.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(maleSeller);
});

maleSeller.addEventListener("click", (event) => {
    event.target.className = "activeOption";
    editTextClass(femaleSeller);
});
