package com.wew.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.corydoras,
                nameSuperhero = "Ikan Corydoras",
                descSuperhero = "Ikan tikus disebut juga bronze catfish atau armoured catfish, memiliki nama ilmiah Corydora. Disebut ikan tikus karena ikan ini memiliki sifat pemalu, sama seperti tikus yang ketakutan ketika terlihat manusia."
            ),
            Superhero(
                R.drawable.cupang,
                nameSuperhero = "Ikan Cupang",
                descSuperhero = "Cupang, ikan laga, atau ikan adu siam adalah ikan air tawar yang habitat asalnya adalah beberapa negara di Asia Tenggara, antara lain Indonesia, Thailand, Malaysia, Brunei Darussalam, Singapura, Vietnam, dan Indonesia."
            ),
            Superhero(
                R.drawable.discus,
                nameSuperhero = "Ikan Discus",
                descSuperhero = "Discus adalah salah satu ikan hias yang paling indah dan paling sering dipelihara. Mereka termasuk dalam genus Symphysodon, yang pada dasarnya mengandung tiga spesies: Heckel Discus (S. discus), Green Discus (S. aequifasciatus), dan Blue and Brown Discus (S. haraldi)."
            ),
            Superhero(
                R.drawable.guppy,
                nameSuperhero = "Ikan Guppy",
                descSuperhero = "Gupi, ikan seribu, ikan cere, atau suwadakar, adalah salah satu spesies ikan hias air tawar yang paling populer di dunia. Karena mudahnya menyesuaikan diri dan beranak-pinak, di banyak tempat di Indonesia ikan ini telah menjadi ikan liar yang memenuhi parit-parit dan selokan."
            ),
            Superhero(
                R.drawable.gurame,
                nameSuperhero = "Ikan Honey Gurame",
                descSuperhero = "Honey gourami alias ikan hias gurami madu memiliki nama Trichogaster chuna. Namanya tentu masih berhubungan dengan penampilannya yang oranye bagai madu."
            ),
            Superhero(
                R.drawable.komet,
                nameSuperhero = "Ikan Komet",
                descSuperhero = "Ikan komet adalah salah satu varian ikan mas koki tertua yang paling terkenal."
            ),
            Superhero(
                R.drawable.molly,
                nameSuperhero = "Ikan Molly",
                descSuperhero = "Ikan molly merupakan ikan hias air tawar yang memiliki warna-warna menarik. Ikan dengan nama latin Poecilia Sp ini memiliki bentuk tubuh yang kecil, dan ukuran ikan ini hanya mencapai maksimal 15 cm saat mereka dewasa. Ukuran tubuh dari ikan molly betina lebih besar daripada ukuran tubuh jantan."
            ),
            Superhero(
                R.drawable.platy,
                nameSuperhero = "Ikan Platy",
                descSuperhero = "Ikan platy merupakan salah satu ikan hias air tawar yang banyak diminati oleh para pecinta ikan hias. Ikan ini memiliki ciri khas yakni warna yang menarik dan pada ikan jantan terdapat sirip belakang yang panjang menyerupai pedang. Ikan platy pedang memiliki harga yang ekonomis."
            ),
            Superhero(
                R.drawable.tetra,
                nameSuperhero = "Ikan Tetra",
                descSuperhero = "Ikan neon tetra adalah ikan hias yang cantik untuk dipelihara. Ikan ini penuh warna, menyenangkan untuk dipandang, dan mudah dipelihara. Ikan neon tetra akan hidup dengan lebih baik jika ditempatkan dalam gerombolan, minimal sepuluh ekor dalam satu akuarium."
            ),
            Superhero(
                R.drawable.zebra,
                nameSuperhero = "Ikan Zebra",
                descSuperhero = "Ikan zebra adalah salah satu spesies ikan bermarga Danio dari keluarga siprinide. Penggunaan nama umum \"ikan zebra\" pada Danio rerio didasari oleh adanya garis-garis pigmen horizontal pada tubuh ikan zebra yang menyerupai garis-garis pada tubuh zebra."
            ),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}