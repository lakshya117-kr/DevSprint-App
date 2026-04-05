import retrofit2.http.GET
import retrofit2.http.Path

interface Api_interface {
    @GET("advice")
    suspend fun getRandomAdvice(): AdviceResponse

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): RMCharacter
}