const map = new Map();

const lee = { name: 'Lee' };
const kim = { name: 'Kim' };

map.set(lee, 'developer').set(kim, 'designer');
console.log('map : ', map);

map.delete(kim);
console.log('delete map : ', map);
