const lee = { name: 'Lee' };
const kim = { name: 'Kim' };

const map = new Map([
    [lee, 'developer'],
    [kim, 'designer'],
]);
console.log('map : ', map);
map.clear();
console.log('clear map : ', map);
