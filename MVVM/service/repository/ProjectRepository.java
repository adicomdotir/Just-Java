public class ProjectRepository {
    private GitHubService gitHubService;

    //…

    public LiveData<List<Project>> getProjectList(String userId) {
        final MutableLiveData<List<Project>> data = new MutableLiveData<>();

        gitHubService.getProjectList(userId).enqueue(new Callback<List<Project>>() {
            @Override
            public void onResponse(Call<List<Project>> call, Response<List<Project>> response) {
                data.setValue(response.body());
            }

            // Error handling will be explained in the next article …
        });

        return data;
    }
    
    // …
}