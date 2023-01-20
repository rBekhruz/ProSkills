package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView2 = findViewById(R.id.recyclerView2)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        val layoutManager2 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView2.layoutManager = layoutManager2

        val myAdapter = Adapter()
        recyclerView.adapter = myAdapter

        myAdapter.list = listOf(
            history("Bekhruz", "https://avatars.mds.yandex.net/i?id=96abecdd036ecaf9a676538fd124aa5553d24eeb-7801542-images-thumbs&n=13"),
            history("sih_ska", "https://avatars.mds.yandex.net/i?id=509bda4e755ad5caf21e1748a6596fb7098b9d57-7751470-images-thumbs&n=13"),
            history("sh_diiiiin", "https://avatars.mds.yandex.net/i?id=014b99fcb3d42732a65b01a1e5e4381ba4726eb2-4292261-images-thumbs&n=13"),
            history("islom_din", "https://avatars.mds.yandex.net/i?id=dd21a8600d579ec1cf3d5906a1d91718-5690699-images-thumbs&n=13"),
            history("le_bron", "https://avatars.mds.yandex.net/i?id=9c5270e58a4998d129088a75cf08354229fb908e-8356639-images-thumbs&n=13"),
            history("s_curry", "https://avatars.mds.yandex.net/i?id=dfe5dc05fffdaa1fe74deed8a340692dfe62decb-4963036-images-thumbs&n=13"),
            history("Vasiliy", "https://i.pinimg.com/736x/af/fd/05/affd053479efe6211ccb5aaa0e237e89--handsome-boys-gerard-butler.jpg"),
            history("tekhronshoh", "https://avatars.mds.yandex.net/i?id=e15a5e5cbe1ce9c4b624cc11e66167e6abad2779-8187583-images-thumbs&n=13")
        )
        myAdapter.notifyDataSetChanged()

        val myAdapter2 = Adapter2()
        recyclerView2.adapter = myAdapter2

        myAdapter2.list2 = listOf(
            post("Bekhruz", "https://avatars.mds.yandex.net/i?id=96abecdd036ecaf9a676538fd124aa5553d24eeb-7801542-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=c120cce984ec7f455a8bdf3f174122de3575fee4-8370529-images-thumbs&n=13", "Bekhruz", "My lvl in photoshop!"),
            post("sih_ska", "https://avatars.mds.yandex.net/i?id=509bda4e755ad5caf21e1748a6596fb7098b9d57-7751470-images-thumbs&n=13", "https://phonoteka.org/uploads/posts/2021-05/1621715485_31-phonoteka_org-p-topovie-foni-dlya-telefona-33.jpg", "sih_ska", "Немножко о природе."),
            post("sh_diiiiin", "https://avatars.mds.yandex.net/i?id=014b99fcb3d42732a65b01a1e5e4381ba4726eb2-4292261-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=2169d3a6e421e721ffe1501ec435f9ea047396c1-8496275-images-thumbs&n=13", "sh_diiiiin", "Мой новый дом"),
            post("islom_din", "https://avatars.mds.yandex.net/i?id=dd21a8600d579ec1cf3d5906a1d91718-5690699-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=0674e6a136c25c0b2e83b11fae39a4b8-5338775-images-thumbs&n=13", "islom_din", "Now I am Android - developer"),
            post("le_bron", "https://avatars.mds.yandex.net/i?id=9c5270e58a4998d129088a75cf08354229fb908e-8356639-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=0e10a295ae8ebb6c5b0c8784fe8d6d049a765fec-4919870-images-thumbs&n=13", "le_bron", "We will WIN!"),
            post("s_curry", "https://avatars.mds.yandex.net/i?id=dfe5dc05fffdaa1fe74deed8a340692dfe62decb-4963036-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=7ca648aa74090db2844fbbd3fc466f1de87410c6-6946680-images-thumbs&n=13", "s_curry", "LeBron it's end of you!"),
            post("Vasiliy", "https://i.pinimg.com/736x/af/fd/05/affd053479efe6211ccb5aaa0e237e89--handsome-boys-gerard-butler.jpg", "https://avatars.mds.yandex.net/i?id=c11082541a79c2d59488ab02084da5e3b63af91c-5334622-images-thumbs&n=13", "Vasiliy", "My HOME."),
            post("tekhronshoh", "https://avatars.mds.yandex.net/i?id=e15a5e5cbe1ce9c4b624cc11e66167e6abad2779-8187583-images-thumbs&n=13", "https://avatars.mds.yandex.net/i?id=2399e504b1eedbc76ab0365ba5d6c28539b38a93-5500260-images-thumbs&n=13", "tekhronshoh", "My new University.")
        )

    }
}