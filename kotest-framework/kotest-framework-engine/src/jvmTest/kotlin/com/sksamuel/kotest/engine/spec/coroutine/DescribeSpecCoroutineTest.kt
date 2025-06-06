package com.sksamuel.kotest.engine.spec.coroutine

import io.kotest.core.annotation.EnabledIf
import io.kotest.core.annotation.LinuxOnlyGithubCondition
import io.kotest.core.spec.style.DescribeSpec
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@EnabledIf(LinuxOnlyGithubCondition::class)
class DescribeSpecCoroutineTest : DescribeSpec() {

   init {
      describe("a") {
         it("b") {
            launch {
               delay(2)
            }
         }
      }
   }
}
