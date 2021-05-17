package com.mumti.jetpacksubmission.utils

import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.data.remote.response.MovieResponse
import com.mumti.jetpacksubmission.data.remote.response.TvResponse
import java.util.ArrayList

object DataDummy {

    fun generateDummyMovies(): List<MovieEntity> {

        val film = ArrayList<MovieEntity>()

        film.add(
            MovieEntity(
                "a1",
                "A Star Is Born",
                "Drama, Romance, Music",
                "2h 16m",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "October 3, 2018",
                "-",
                "https://www.themoviedb.org/t/p/original/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg")
        )

        film.add(
            MovieEntity(
                "a2",
                "Alita: Battle Angel",
                "Action, Science Fiction, Adventure",
                "2h 2m",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "January 31, 2019",
                "An angel falls. A warrior rises.",
                "https://www.themoviedb.org/t/p/original/xRWht48C2V8XNfzvPehyClOvDni.jpg")
        )

        film.add(
            MovieEntity(
                "a3",
                "Aquaman",
                "Action, Adventure, Fantasy",
                "2h 33m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "December 7, 2018",
                "Home Is Calling",
                "https://www.themoviedb.org/t/p/original/uCg2HPY7rBCrh1YGpXam9LH1xKZ.jpg")
        )

        film.add(
            MovieEntity(
                "a4",
                "Bohemian Rhapsody",
                "Music, Drama, History",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "October 24, 2018",
                "Fearless lives forever",
                "https://www.themoviedb.org/t/p/original/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg")
        )

        film.add(
            MovieEntity(
                "a5",
                "Cold Pursuit",
                "Action, Crime, Thriller",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "February 7, 2019",
                "Meet Nels Coxman. Citizen of the Year.",
                "https://www.themoviedb.org/t/p/original/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg")
        )

        film.add(
            MovieEntity(
                "a6",
                "Creed II",
                "Drama",
                "2h 10m",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "November 21, 2018",
                "There's More to Lose than a Title",
                "https://www.themoviedb.org/t/p/original/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg")
        )

        film.add(
            MovieEntity(
                "a7",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "November 14, 2018",
                "Fate of One. Future of All.",
                "https://www.themoviedb.org/t/p/original/u5QrKhSCGoFsB8aAvZZJ1b53k16.jpg")
        )

        film.add(
            MovieEntity(
                "a8",
                "Glass",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "January 16, 2019",
                "You Cannot Contain What You Are",
                "https://www.themoviedb.org/t/p/original/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg")
        )

        film.add(
            MovieEntity(
                "a9",
                "How to Train Your Dragon: The Hidden World",
                "Animation, Family, Adventure",
                "1h 44m",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "January 3, 2019",
                "One adventure will change two worlds",
                "https://www.themoviedb.org/t/p/original/gHoZaNRTCYNjftaqZFjjV15OSHr.jpg")
        )

        film.add(
            MovieEntity(
                "a10",
                "Avengers: Infinity War",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "April 25, 2018",
                "An entire universe. Once and for all.",
                "https://www.themoviedb.org/t/p/original/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg")
        )

        film.add(
            MovieEntity(
                "a11",
                "Mary Queen of Scots",
                "Drama, History",
                "2h 4m",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "December 7, 2018",
                "Bow to No One",
                "https://www.themoviedb.org/t/p/original/b5RMzLAyq5QW6GtN9sIeAEMLlBI.jpg")
        )

        film.add(
            MovieEntity(
                "a12",
                "Master Z: Ip Man Legacy",
                "Action",
                "1h 47m",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "December 20, 2018",
                "-",
                "https://www.themoviedb.org/t/p/original/6VxEvOF7QDovsG6ro9OVyjH07LF.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a13",
                "Mortal Engines",
                "Adventure, Science Fiction",
                "2h 9m",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "November 27, 2018",
                "Some scars never heal",
                "https://www.themoviedb.org/t/p/original/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a14",
                "Overlord",
                "Horror, War, Science Fiction",
                "1h 50m",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "November 1, 2018",
                "Stop the unstoppable",
                "https://www.themoviedb.org/t/p/original/l76Rgp32z2UxjULApxGXAPpYdAP.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a15",
                "Wreck-It Ralph",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "November 1, 2012",
                "The story of a regular guy just looking for a little wreck-ognition.",
                "https://www.themoviedb.org/t/p/original/aqOWDTgb8GnMv9cInjKDgAyDM3i.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a16",
                "Robin Hood",
                "Adventure, Action, Thriller",
                "1h 56m",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "November 21, 2018",
                "The legend you know. The story you don't.",
                "https://www.themoviedb.org/t/p/original/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a17",
                "Serenity",
                "Thriller, Mystery, Drama",
                "1h 42m",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "January 24, 2019",
                "On Plymouth Island, no one ever dies… unless you break the rules",
                "https://www.themoviedb.org/t/p/original/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a18",
                "Spider-Man: Into the Spider-Verse",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "1h 57m",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "December 6, 2018",
                "More Than One Wears the Mask",
                "https://www.themoviedb.org/t/p/original/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg"
            )
        )

        film.add(
            MovieEntity(
                "a19",
                "T-34",
                "War, Action, Drama, History",
                "2h 19m",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "December 27, 2018",
                "Fast And Furious On Tanks",
                "https://www.themoviedb.org/t/p/original/jqBIHiSglRfNxjh1zodHLa9E7zW.jpg"
            )
        )

        return film
    }

    fun generateDummyTvShows(): List<TvEntity> {

        val tvShow = ArrayList<TvEntity>()

        tvShow.add(
            TvEntity(
                "b1",
                "Arrow",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "October 10, 2012",
                "Heroes fall. Legends rise.",
                "https://www.themoviedb.org/t/p/original/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b2",
                "Doom Patrol",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "February 15, 2019",
                "-",
                "https://www.themoviedb.org/t/p/original/nclcURTdlqVbDr6HPmrHC5X4qUu.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b3",
                "Dragon Ball Absalon",
                "-",
                "-",
                "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.Each character will bring forth their own set of capabilities and purpose, winning fights and being relevant, in order to create an environment that emphasizes teamwork as well as individual worth for each character. In this series, the main set of villains are Saiyans, with abilities highly similar to the Saiyans that we are familiar with. These new Saiyans are more powerful than any threat the Z Fighters have ever faced, but after twelve years of intensive training, our heroes will not be easily defeated .",
                "November 30, 2012",
                "-",
                "https://www.themoviedb.org/t/p/original/xs1BRXnY5kStzwdxyrl2HYJOJCq.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b4",
                "Fairy Tail",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                "25m",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "October 12, 2009",
                "-",
                "https://www.themoviedb.org/t/p/original/1T6XCwWpmg1B4jrzAlcFCnJGQVD.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b5",
                "Family Guy",
                "Animation, Comedy",
                "22m",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "January 31, 1999",
                "Parental Discretion Advised, that's how you know it's good",
                "https://www.themoviedb.org/t/p/original/eWWCRjBfLyePh2tfZdvNcIvKSJe.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b6",
                "The Flash",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "October 7, 2014",
                "The fastest man alive.",
                "https://www.themoviedb.org/t/p/original/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b7",
                "Gotham",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "September 22, 2014",
                "Before Batman, there was Gotham.",
                "https://www.themoviedb.org/t/p/original/5tSHzkJ1HBnyGdcpr6wSyw7jYnJ.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b8",
                "Grey's Anatomy",
                "Drama",
                "43m",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "March 27, 2005",
                "The life you save may be your own.",
                "https://www.themoviedb.org/t/p/original/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b9",
                "Hanna",
                "Action & Adventure, Drama",
                "50m",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "March 28, 2019",
                "-",
                "https://www.themoviedb.org/t/p/original/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b10",
                "Naruto Shippūden",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "February 15, 2007",
                "-",
                "https://www.themoviedb.org/t/p/original/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b11",
                "NCIS",
                "Crime, Action & Adventure, Drama",
                "45m",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "September 23, 2003",
                "-",
                "https://www.themoviedb.org/t/p/original/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b12",
                "Riverdale",
                "Mystery, Drama, Crime",
                "45m",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "January 26, 2017",
                "Small town. Big secrets.",
                "https://www.themoviedb.org/t/p/original/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b13",
                "Supergirl",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "42m",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "October 26, 2015",
                "A force against fear",
                "https://www.themoviedb.org/t/p/original/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b14",
                "Supernatural",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "September 13, 2005",
                "Between darkness and deliverance",
                "https://www.themoviedb.org/t/p/original/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b15",
                "The Simpsons",
                "Family, Animation, Comedy",
                "22m",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "December 17, 1989",
                "On your marks, get set, d'oh!",
                "https://www.themoviedb.org/t/p/original/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b16",
                "The Umbrella Academy",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "55m",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "February 15, 2019",
                "Super. Dysfunctional. Family.",
                "https://www.themoviedb.org/t/p/original/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg"
            )
        )

        tvShow.add(
            TvEntity(
                "b17",
                "The Walking Dead",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "October 31, 2010",
                "Fight the dead. Fear the living.",
                "https://www.themoviedb.org/t/p/original/qZSUJmUWdkdND1DpQ4bGCraqDxy.jpg"
            )
        )

        return tvShow
    }

    fun generateRemoteDummyMovies(): List<MovieResponse> {
        val film = ArrayList<MovieResponse>()

        film.add(
            MovieResponse(
                "a1",
                "A Star Is Born",
                "Drama, Romance, Music",
                "2h 16m",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "October 3, 2018",
                "-",
                "https://www.themoviedb.org/t/p/original/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg")
        )

        film.add(
            MovieResponse(
                "a2",
                "Alita: Battle Angel",
                "Action, Science Fiction, Adventure",
                "2h 2m",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "January 31, 2019",
                "An angel falls. A warrior rises.",
                "https://www.themoviedb.org/t/p/original/xRWht48C2V8XNfzvPehyClOvDni.jpg")
        )

        film.add(
            MovieResponse(
                "a3",
                "Aquaman",
                "Action, Adventure, Fantasy",
                "2h 33m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "December 7, 2018",
                "Home Is Calling",
                "https://www.themoviedb.org/t/p/original/uCg2HPY7rBCrh1YGpXam9LH1xKZ.jpg")
        )

        film.add(
            MovieResponse(
                "a4",
                "Bohemian Rhapsody",
                "Music, Drama, History",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "October 24, 2018",
                "Fearless lives forever",
                "https://www.themoviedb.org/t/p/original/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg")
        )

        film.add(
            MovieResponse(
                "a5",
                "Cold Pursuit",
                "Action, Crime, Thriller",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "February 7, 2019",
                "Meet Nels Coxman. Citizen of the Year.",
                "https://www.themoviedb.org/t/p/original/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg")
        )

        film.add(
            MovieResponse(
                "a6",
                "Creed II",
                "Drama",
                "2h 10m",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "November 21, 2018",
                "There's More to Lose than a Title",
                "https://www.themoviedb.org/t/p/original/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg")
        )

        film.add(
            MovieResponse(
                "a7",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "November 14, 2018",
                "Fate of One. Future of All.",
                "https://www.themoviedb.org/t/p/original/u5QrKhSCGoFsB8aAvZZJ1b53k16.jpg")
        )

        film.add(
            MovieResponse(
                "a8",
                "Glass",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "January 16, 2019",
                "You Cannot Contain What You Are",
                "https://www.themoviedb.org/t/p/original/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg")
        )

        film.add(
            MovieResponse(
                "a9",
                "How to Train Your Dragon: The Hidden World",
                "Animation, Family, Adventure",
                "1h 44m",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "January 3, 2019",
                "One adventure will change two worlds",
                "https://www.themoviedb.org/t/p/original/gHoZaNRTCYNjftaqZFjjV15OSHr.jpg")
        )

        film.add(
            MovieResponse(
                "a10",
                "Avengers: Infinity War",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "April 25, 2018",
                "An entire universe. Once and for all.",
                "https://www.themoviedb.org/t/p/original/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg")
        )

        film.add(
            MovieResponse(
                "a11",
                "Mary Queen of Scots",
                "Drama, History",
                "2h 4m",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "December 7, 2018",
                "Bow to No One",
                "https://www.themoviedb.org/t/p/original/b5RMzLAyq5QW6GtN9sIeAEMLlBI.jpg")
        )

        film.add(
            MovieResponse(
                "a12",
                "Master Z: Ip Man Legacy",
                "Action",
                "1h 47m",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "December 20, 2018",
                "-",
                "https://www.themoviedb.org/t/p/original/6VxEvOF7QDovsG6ro9OVyjH07LF.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a13",
                "Mortal Engines",
                "Adventure, Science Fiction",
                "2h 9m",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "November 27, 2018",
                "Some scars never heal",
                "https://www.themoviedb.org/t/p/original/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a14",
                "Overlord",
                "Horror, War, Science Fiction",
                "1h 50m",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "November 1, 2018",
                "Stop the unstoppable",
                "https://www.themoviedb.org/t/p/original/l76Rgp32z2UxjULApxGXAPpYdAP.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a15",
                "Wreck-It Ralph",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "November 1, 2012",
                "The story of a regular guy just looking for a little wreck-ognition.",
                "https://www.themoviedb.org/t/p/original/aqOWDTgb8GnMv9cInjKDgAyDM3i.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a16",
                "Robin Hood",
                "Adventure, Action, Thriller",
                "1h 56m",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "November 21, 2018",
                "The legend you know. The story you don't.",
                "https://www.themoviedb.org/t/p/original/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a17",
                "Serenity",
                "Thriller, Mystery, Drama",
                "1h 42m",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "January 24, 2019",
                "On Plymouth Island, no one ever dies… unless you break the rules",
                "https://www.themoviedb.org/t/p/original/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a18",
                "Spider-Man: Into the Spider-Verse",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "1h 57m",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "December 6, 2018",
                "More Than One Wears the Mask",
                "https://www.themoviedb.org/t/p/original/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg"
            )
        )

        film.add(
            MovieResponse(
                "a19",
                "T-34",
                "War, Action, Drama, History",
                "2h 19m",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "December 27, 2018",
                "Fast And Furious On Tanks",
                "https://www.themoviedb.org/t/p/original/jqBIHiSglRfNxjh1zodHLa9E7zW.jpg"
            )
        )

        return film
    }

    fun generateRemoteDummyTvShow(): List<TvResponse> {

        val tvShow = ArrayList<TvResponse>()

        tvShow.add(
            TvResponse(
                "b1",
                "Arrow",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "October 10, 2012",
                "Heroes fall. Legends rise.",
                "https://www.themoviedb.org/t/p/original/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b2",
                "Doom Patrol",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "February 15, 2019",
                "-",
                "https://www.themoviedb.org/t/p/original/nclcURTdlqVbDr6HPmrHC5X4qUu.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b3",
                "Dragon Ball Absalon",
                "-",
                "-",
                "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.Each character will bring forth their own set of capabilities and purpose, winning fights and being relevant, in order to create an environment that emphasizes teamwork as well as individual worth for each character. In this series, the main set of villains are Saiyans, with abilities highly similar to the Saiyans that we are familiar with. These new Saiyans are more powerful than any threat the Z Fighters have ever faced, but after twelve years of intensive training, our heroes will not be easily defeated .",
                "November 30, 2012",
                "-",
                "https://www.themoviedb.org/t/p/original/xs1BRXnY5kStzwdxyrl2HYJOJCq.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b4",
                "Fairy Tail",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                "25m",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "October 12, 2009",
                "-",
                "https://www.themoviedb.org/t/p/original/1T6XCwWpmg1B4jrzAlcFCnJGQVD.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b5",
                "Family Guy",
                "Animation, Comedy",
                "22m",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "January 31, 1999",
                "Parental Discretion Advised, that's how you know it's good",
                "https://www.themoviedb.org/t/p/original/eWWCRjBfLyePh2tfZdvNcIvKSJe.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b6",
                "The Flash",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "October 7, 2014",
                "The fastest man alive.",
                "https://www.themoviedb.org/t/p/original/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b7",
                "Gotham",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "September 22, 2014",
                "Before Batman, there was Gotham.",
                "https://www.themoviedb.org/t/p/original/5tSHzkJ1HBnyGdcpr6wSyw7jYnJ.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b8",
                "Grey's Anatomy",
                "Drama",
                "43m",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "March 27, 2005",
                "The life you save may be your own.",
                "https://www.themoviedb.org/t/p/original/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b9",
                "Hanna",
                "Action & Adventure, Drama",
                "50m",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "March 28, 2019",
                "-",
                "https://www.themoviedb.org/t/p/original/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b10",
                "Naruto Shippūden",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "February 15, 2007",
                "-",
                "https://www.themoviedb.org/t/p/original/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b11",
                "NCIS",
                "Crime, Action & Adventure, Drama",
                "45m",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "September 23, 2003",
                "-",
                "https://www.themoviedb.org/t/p/original/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b12",
                "Riverdale",
                "Mystery, Drama, Crime",
                "45m",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "January 26, 2017",
                "Small town. Big secrets.",
                "https://www.themoviedb.org/t/p/original/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b13",
                "Supergirl",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "42m",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "October 26, 2015",
                "A force against fear",
                "https://www.themoviedb.org/t/p/original/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b14",
                "Supernatural",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "September 13, 2005",
                "Between darkness and deliverance",
                "https://www.themoviedb.org/t/p/original/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b15",
                "The Simpsons",
                "Family, Animation, Comedy",
                "22m",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "December 17, 1989",
                "On your marks, get set, d'oh!",
                "https://www.themoviedb.org/t/p/original/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b16",
                "The Umbrella Academy",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "55m",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "February 15, 2019",
                "Super. Dysfunctional. Family.",
                "https://www.themoviedb.org/t/p/original/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg"
            )
        )

        tvShow.add(
            TvResponse(
                "b17",
                "The Walking Dead",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "October 31, 2010",
                "Fight the dead. Fear the living.",
                "https://www.themoviedb.org/t/p/original/qZSUJmUWdkdND1DpQ4bGCraqDxy.jpg"
            )
        )

        return tvShow
    }

    fun generateDetailMovies(movies: MovieEntity, favorited: Boolean) : MovieEntity {
        movies.favorited = favorited
        return movies
    }

    fun generateDetailTvShows(tv: TvEntity, favorited: Boolean) : TvEntity {
        tv.favorited = favorited
        return tv
    }
}