object Libs {

   const val kotlinVersion = "1.4.31"
   const val org = "io.kotest.extensions"

   object Kotest {
      private const val version = "4.4.3"
      const val assertionsShared = "io.kotest:kotest-assertions-shared:$version"
      const val api = "io.kotest:kotest-framework-api:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
   }

   object Klock {
      private const val version = "2.0.6"
      const val klock = "com.soywiz.korlibs.klock:klock:$version"
   }
}
