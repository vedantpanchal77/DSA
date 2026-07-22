#include <stdio.h>

int main()
{
    int graph[10][10] = {0};
    int vertices, edges;
    int u, v;

    printf("Enter number of vertices: ");
    scanf("%d",&vertices);

    printf("Enter number of edges: ");
    scanf("%d",&edges);

    printf("Enter each edge (u v):\n");

    for(int i=0;i<edges;i++)
    {
        scanf("%d %d",&u,&v);

        graph[u][v]=1;
        graph[v][u]=1;
    }

    printf("\nAdjacency Matrix:\n\n");

   

    for(int i=1;i<=vertices;i++)
    {

        for(int j=1;j<=vertices;j++)
        {
            printf("%d ",graph[i][j]);
        }

        printf("\n");
    }

    return 0;
}