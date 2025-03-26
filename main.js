let scene, camera, renderer, player, controls;
const TILE_SIZE = 32;
const WORLD_WIDTH = 100;
const WORLD_HEIGHT = 20;
let world = [];

// Perlin noise function to generate smooth terrain
function perlinNoise(x) {
    let n = Math.floor(x 