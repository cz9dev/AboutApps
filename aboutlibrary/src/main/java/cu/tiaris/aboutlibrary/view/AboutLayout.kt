package cu.tiaris.aboutlibrary.view

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import cu.tiaris.aboutlibrary.R
import xyz.schwaab.avvylib.AvatarView

class AboutLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    private var uriGitHubApp: Uri? = null
    private var uriWebSiteApp: Uri? = null
    private var uriApklisApp: Uri? = null
    private var uriTodusApp: Uri? = null
    private var uriTelegramApp: Uri? = null
    private var uriGitHubDev: Uri? = null
    private var uriWebSiteDev: Uri? = null
    private var uriApklisDev: Uri? = null
    private var uriTodusDev: Uri? = null
    private var uriLinkedInDev: Uri? = null
    private var uriFacebookDev: Uri? = null
    private var uriXDev: Uri? = null
    private var eMailDev: String? = null
    private var uriTelegramDev: Uri? = null

    private var llGitHubApp: LinearLayout
    private var llWebSiteApp: LinearLayout
    private var llApklisApp: LinearLayout
    private var llTodusApp: LinearLayout
    private var llTelegramApp: LinearLayout
    private var llGitHubDev: LinearLayout
    private var llWebSiteDev: LinearLayout
    private var llApklisDev: LinearLayout
    private var llTodusDev: LinearLayout
    private var llLinkedInDev: LinearLayout
    private var llFacebookDev: LinearLayout
    private var llXDev: LinearLayout
    private var llEMailDev: LinearLayout
    private var llTelegramDev: LinearLayout

    init {
        LayoutInflater.from(context).inflate(R.layout.component_about_cz9dev, this, true)

        this.llGitHubApp = findViewById(R.id.ll_github_app)
        this.llWebSiteApp = findViewById(R.id.ll_website_app)
        this.llApklisApp = findViewById(R.id.ll_apklis_app)
        this.llTodusApp = findViewById(R.id.ll_todus_app)
        this.llTelegramApp = findViewById(R.id.ll_telegram_app)
        this.llGitHubDev = findViewById(R.id.ll_github_dev)
        this.llWebSiteDev = findViewById(R.id.ll_website_dev)
        this.llApklisDev = findViewById(R.id.ll_apklis_dev)
        this.llTodusDev = findViewById(R.id.ll_todus_dev)
        this.llLinkedInDev = findViewById(R.id.ll_linkedin_dev)
        this.llFacebookDev = findViewById(R.id.ll_facebook_dev)
        this.llXDev = findViewById(R.id.ll_twitter_dev)
        this.llEMailDev = findViewById(R.id.ll_email_dev)
        this.llTelegramDev = findViewById(R.id.ll_telegram_dev)

        llGitHubApp.setOnClickListener {
            if (uriGitHubApp != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriGitHubApp)
                context.startActivity(intent)
            }
        }

        llWebSiteApp.setOnClickListener {
            if (uriWebSiteApp != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriWebSiteApp)
                context.startActivity(intent)
            }
        }

        llApklisApp.setOnClickListener {
            if (uriApklisApp != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriApklisApp)
                context.startActivity(intent)
            }
        }

        llTodusApp.setOnClickListener {
            if (uriTodusApp != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriTodusApp)
                context.startActivity(intent)
            }
        }

        llTelegramApp.setOnClickListener {
            if (uriTelegramApp != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriTelegramApp)
                context.startActivity(intent)
            }
        }

        llGitHubDev.setOnClickListener {
            if (uriGitHubDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriGitHubDev)
                context.startActivity(intent)
            }
        }

        llWebSiteDev.setOnClickListener {
            if (uriWebSiteDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriWebSiteDev)
                context.startActivity(intent)
            }
        }

        llApklisDev.setOnClickListener {
            if (uriApklisDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriApklisDev)
                context.startActivity(intent)
            }
        }

        llTodusDev.setOnClickListener {
            if (uriTodusDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriTodusDev)
                context.startActivity(intent)
            }
        }

        llLinkedInDev.setOnClickListener {
            if (uriLinkedInDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriLinkedInDev)
                context.startActivity(intent)
            }
        }

        llFacebookDev.setOnClickListener {
            if (uriFacebookDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriFacebookDev)
                context.startActivity(intent)
            }
        }

        llXDev.setOnClickListener {
            if (uriXDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriXDev)
                context.startActivity(intent)
            }
        }

        llEMailDev.setOnClickListener {
            if (eMailDev != null) {
                val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$eMailDev"))
                    .putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo")
                    .putExtra(Intent.EXTRA_TEXT, "Correo de contacto")
                context.startActivity(intent)
            }
        }

        llTelegramDev.setOnClickListener {
            if (uriTelegramDev != null) {
                val intent = Intent(Intent.ACTION_VIEW, uriTelegramDev)
                context.startActivity(intent)
            }
        }
    }

    /**
     * Declara todas las propiedades en la misma funcion
     * @param uriGitHubApp to uriGitHubApp
     * @param uriWebSiteApp to uriWebSiteApp
     * @param uriApklisApp to uriApklisApp
     * @param uriTodusApp to uriTodusApp
     * @param uriTelegramApp to uriTelegramApp
     * @param uriGitHubDev to uriGitHubDev
     * @param uriWebSiteDev to uriWebSiteDev
     * @param uriApklisDev to uriApklisDev
     * @param uriTodusDev to uriTodusDev
     * @param uriLinkedInDev to uriLinkedInDev
     * @param uriFacebookDev to uriFacebookDev
     * @param uriXDev to uriXDev
     * @param eMailDev example: people@gmail.com
     * @param uriTelegramDev to uriTelegramDev
     * */
    fun everyLink(
        uriGitHubApp: Uri? = null,
        uriWebSiteApp: Uri? = null,
        uriApklisApp: Uri? = null,
        uriTodusApp: Uri? = null,
        uriTelegramApp: Uri? = null,
        uriGitHubDev: Uri? = null,
        uriWebSiteDev: Uri? = null,
        uriApklisDev: Uri? = null,
        uriTodusDev: Uri? = null,
        uriLinkedInDev: Uri? = null,
        uriFacebookDev: Uri? = null,
        uriXDev: Uri? = null,
        eMailDev: String? = null,
        uriTelegramDev: Uri? = null
    ) {
        if (uriGitHubApp != null) {
            this.uriGitHubApp = uriGitHubApp
            this.llGitHubApp.visibility = View.VISIBLE
        }
        if (uriWebSiteApp != null) {
            this.uriWebSiteApp = uriWebSiteApp
            this.llWebSiteApp.visibility = View.VISIBLE
        }
        if (uriApklisApp != null) {
            this.uriApklisApp = uriApklisApp
            this.llApklisApp.visibility = View.VISIBLE
        }
        if (uriTodusApp != null) {
            this.uriTodusApp = uriTodusApp
            this.llTodusApp.visibility = View.VISIBLE
        }
        if (uriTelegramApp != null) {
            this.uriTelegramApp = uriTelegramApp
            this.llTelegramApp.visibility = View.VISIBLE
        }
        if (uriGitHubDev != null) {
            this.uriGitHubDev = uriGitHubDev
            this.llGitHubDev.visibility = View.VISIBLE
        }
        if (uriWebSiteDev != null) {
            this.uriWebSiteDev = uriWebSiteDev
            this.llWebSiteDev.visibility = View.VISIBLE
        }
        if (uriApklisDev != null) {
            this.uriApklisDev = uriApklisDev
            this.llApklisDev.visibility = View.VISIBLE
        }
        if (uriTodusDev != null) {
            this.uriTodusDev = uriTodusDev
            this.llTodusDev.visibility = View.VISIBLE
        }
        if (uriLinkedInDev != null) {
            this.uriLinkedInDev = uriLinkedInDev
            this.llLinkedInDev.visibility = View.VISIBLE
        }
        if (uriFacebookDev != null) {
            this.uriFacebookDev = uriFacebookDev
            this.llFacebookDev.visibility = View.VISIBLE
        }
        if (uriXDev != null) {
            this.uriXDev = uriXDev
            this.llXDev.visibility = View.VISIBLE
        }
        if (eMailDev != null) {
            this.eMailDev = eMailDev
            this.llEMailDev.visibility = View.VISIBLE
        }
        if (uriTelegramDev != null) {
            this.uriTelegramDev = uriTelegramDev
            this.llTelegramDev.visibility = View.VISIBLE
        }
    }

    /**
     * Asignar el nombre de la App
     * @param name Nombre a asignarle a la app
     * */
    fun setNameApp(name: String) {
        val nameApp = findViewById<TextView>(R.id.name_app)
        nameApp.text = name
    }

    /**
     * Asignar el la version de la App
     * @param version Para asignarle la version
     * */
    fun setVersionNameApp(version: String) {
        val versionNameApp = findViewById<TextView>(R.id.version_name_app)
        versionNameApp.text = version
    }

    /**
     * Descripción de la App
     * @param description
     * */
    fun setDescriptionApp(description: String) {
        val descriptionApp = findViewById<TextView>(R.id.description_app)
        descriptionApp.text = description
    }

    /**
     * Nombre del desarrollador
     * @param name
     * */
    fun setNameDev(name: String) {
        val nameDev = findViewById<TextView>(R.id.name_dev)
        nameDev.text = name
    }

    /**
     * Usuario del desarrolador
     * @param user
     * */
    fun setUserDev(user: String) {
        val userDev = findViewById<TextView>(R.id.user_dev)
        userDev.text = user
    }

    /**
     * Descripción del desarrollador
     * @param description
     * */
    fun setDescriptionDev(description: String) {
        val descriptionDev = findViewById<TextView>(R.id.description_dev)
        descriptionDev.text = description
    }

    /**
     * Logo de la App
     * @param logo
     * */
    fun setLogoApp(logo: Drawable) {
        val avatarApp = findViewById<AvatarView>(R.id.avatar_app)
        avatarApp.setImageDrawable(logo)
    }

    /**
     * Logo de la App
     * @param logo
     * */
    fun setLogoApp(logo: Icon) {
        val avatarApp = findViewById<AvatarView>(R.id.avatar_app)
        avatarApp.setImageIcon(logo)
    }

    /**
     * Avatar del desarrollador
     * @param avatar
     * */
    fun setAvatarDev(avatar: Drawable) {
        val avatarDev = findViewById<AvatarView>(R.id.avatar_dev)
        avatarDev.setImageDrawable(avatar)
    }

    /**
     * Avatar del desarrollador
     * @param avatar
     * */
    fun setAvatarDev(avatar: Icon) {
        val avatarDev = findViewById<AvatarView>(R.id.avatar_dev)
        avatarDev.setImageIcon(avatar)
    }

    /**
     * Uri de red social Github
     * @param uri
     * */
    fun setUriGithubApp(uri: Uri) {
        this.uriGitHubApp = uri
        llGitHubApp.visibility = View.VISIBLE
    }

    /**
     * Uri del sitio web de la App
     * @param uri
     * */
    fun setUriWebSiteApp(uri: Uri) {
        this.uriWebSiteApp = uri
        llWebSiteApp.visibility = View.VISIBLE
    }

    /**
     * Uri de la tienda de aplicaciones de Apklis
     * @param uri
     * */
    fun setUriApklisApp(uri: Uri) {
        this.uriApklisApp = uri
        llApklisApp.visibility = View.VISIBLE
    }

    /**
     * Uri de red social de Todus de la App
     * @param uri
     * */
    fun setUriTodusApp(uri: Uri) {
        this.uriTodusApp = uri
        llTodusApp.visibility = View.VISIBLE
    }

    /**
     * Uri de red social Telegram de la App
     * @param uri
     * */
    fun setUriTelegramApp(uri: Uri) {
        this.uriTelegramApp = uri
        llTelegramApp.visibility = View.VISIBLE
    }

    /**
     * Uri de red social GitHub
     * @param uri
     * */
    fun setUriGitHubDev(uri: Uri) {
        this.uriGitHubDev = uri
        llGitHubDev.visibility = View.VISIBLE
    }

    /**
     * Uri del sitio web del desarrollador
     * @param uri
     * */
    fun setUriWebSiteDev(uri: Uri) {
        this.uriWebSiteDev = uri
        llWebSiteDev.visibility = View.VISIBLE
    }

    /**
     * Uri de la tienda de aplicaciones Apklis
     * @param uri
     * */
    fun setUriApklisDev(uri: Uri) {
        this.uriApklisDev = uri
        llApklisDev.visibility = View.VISIBLE
    }

    /**
     * Uri de red social Todus
     * @param uri
     * */
    fun setUriTodusDev(uri: Uri) {
        this.uriTodusDev = uri
        llTodusDev.visibility = View.VISIBLE
    }

    /**
     * Uri de red social LinkedIn
     * @param uri
     * */
    fun setUriLinkedInDev(uri: Uri) {
        this.uriLinkedInDev = uri
        llLinkedInDev.visibility = View.VISIBLE
    }

    /**
     * Uri de red social Facebook
     * @param uri
     * */
    fun setUriFacebookDev(uri: Uri) {
        this.uriFacebookDev = uri
        llFacebookDev.visibility = View.VISIBLE
    }

    /**
     * Uri de red social X
     * @param uri
     * */
    fun setUriXDev(uri: Uri) {
        this.uriXDev = uri
        llXDev.visibility = View.VISIBLE
    }

    /**
     * Email del desarrollador
     * @param email
     * */
    fun setEMailDev(email: String) {
        this.eMailDev = email
        llEMailDev.visibility = View.VISIBLE
    }

    /**
     * Uri de red social Telegram
     * @param uri
     * */
    fun setUriTelegramDev(uri: Uri) {
        this.uriTelegramDev = uri
        llTelegramDev.visibility = View.VISIBLE
    }
}