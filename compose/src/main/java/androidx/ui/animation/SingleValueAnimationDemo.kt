/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.animation.demos

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.animation.animate
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.clickable
import androidx.ui.graphics.Color
import androidx.ui.layout.fillMaxSize

@Composable
fun SingleValueAnimationDemo() {
    val enabled = state { true }
    val color = animate(if (enabled.value) Color.Green else Color.Red)
    Box(
        Modifier.fillMaxSize().clickable { enabled.value = !enabled.value },
        backgroundColor = color
    )
}