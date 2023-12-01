package cu.tiaris.aboutapps

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cu.tiaris.aboutapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Logo de la App
        binding.myComponent.setLogoApp(getDrawable(R.drawable.logo_app)!!)
        // Avatar del desarrollador
        binding.myComponent.setAvatarDev(getDrawable(R.drawable.avatar_dev)!!)
        // Nombre de la App
        binding.myComponent.setNameApp("AboutApps!")
        // Version de la App
        binding.myComponent.setVersionNameApp("1.5.9")
        // Descripción de la App
        binding.myComponent.setDescriptionApp("Esta es una apps para prueba, con ella podemos testear detalles de la librería")
        // Nombre del desarrollador
        binding.myComponent.setNameDev("Manuel Angulo Desdin")
        // Nombre de usuario del desarrollador
        binding.myComponent.setUserDev("madev")
        // Descripción del desarrollador
        binding.myComponent.setDescriptionDev("Desarrollador amante a las tic, el deporte. En mi tiempo libre miro las estrellas.")
        // Link de la app y el desarrollador
        binding.myComponent.everyLink(
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            null,
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            Uri.parse("https://apklis.cu/developer/czaldivarp"),
            null
        )

        // Otra forma para reprecentar los link seria como se muestra en el comentario
        /*
        binding.myComponent.setUriGithubApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriWebSiteApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriApklisApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriTodusApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriGitHubDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriWebSiteDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriApklisDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriTodusDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriLinkedInDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriFacebookDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setUriXDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
        binding.myComponent.setEMailDev("czaldivarp@nauta.cu")
         */
    }
}