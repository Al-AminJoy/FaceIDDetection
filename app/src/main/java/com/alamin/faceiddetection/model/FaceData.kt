package com.alamin.faceiddetection.model

import android.graphics.Bitmap

data class FaceData(val name: String,val image:Bitmap,val similarity: SimilarityClassifier.Recognition)
