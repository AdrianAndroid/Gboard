package com.google.learning.expander.pod.inferenceapi.expressiveconcepts;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.nio.MappedByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExpressiveConceptsModelLessPredictor extends BaseExpressiveConceptsPredictor {
    private static final String e = "ExpressiveConceptsModelLessPredictor";

    private ExpressiveConceptsModelLessPredictor(long j) {
        super(j);
    }

    public static BaseExpressiveConceptsPredictor b(File file) {
        try {
            Pair a = ndh.a(file);
            ExpressiveConceptsModelLessPredictor expressiveConceptsModelLessPredictor = new ExpressiveConceptsModelLessPredictor(((Long) a.first).longValue());
            expressiveConceptsModelLessPredictor.b = (ParcelFileDescriptor) a.second;
            return expressiveConceptsModelLessPredictor;
        } catch (ndg e2) {
            Log.e(e, "Failed to create BaseExpressiveConceptsPredictor from file: ".concat(file.toString()), e2);
            return null;
        }
    }

    public static native long initJniWithFd(int i);

    private static native long initJniWithModel(MappedByteBuffer mappedByteBuffer);
}
