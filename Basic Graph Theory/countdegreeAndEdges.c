#include <stdio.h>

int main()
{
    int graph[4][4] = {
        {0, 1, 1, 0},
        {1, 0, 0, 1},
        {1, 0, 0, 0},
        {0, 1, 0, 0}
    };

    int vertex = 2;      // Find degree of Vertex 2
    int degree = 0;
    int total=0;

    // Convert vertex number (1-4) to array index (0-3)
    int row = vertex - 1;

    for(int i = 0; i < 4; i++)
    {
        degree = degree + graph[row][i];
    }
    // count degree
    printf("Degree of Vertex %d = %d", vertex, degree);

    // total degree
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            total=total+graph[i][j];
        }
    }
    printf("\ntotal degree: %d", total);
     // total edges
    int edges=0;
    edges= total/2;
    printf("\ntotal edges %d",edges);
    return 0;
}