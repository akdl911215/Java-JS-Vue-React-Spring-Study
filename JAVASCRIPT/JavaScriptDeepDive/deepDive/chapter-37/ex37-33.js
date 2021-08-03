const map = new Map();

console.log('NaN === NaN : ', NaN === NaN);
console.log('0 === -0 : ', 0 === -0);

// Map은 NaN과 NaN을 같다고 평가하여 중복 추가를 허용하지 않는다
map.set(NaN, 'value1').set(NaN, 'value2');
console.log('map : ', map);

// +0과 -0을 같다고 평가하여 중복 추가를 허용하지 않는다
map.set(0, 'value1').set(-0, 'value2');
console.log('map : ', map);

// ''을 사용하면 string값으로 인식되서 다른값으로 평가한다
map.set('0', 'value1').set('-0', 'value2');
console.log('map : ', map);
