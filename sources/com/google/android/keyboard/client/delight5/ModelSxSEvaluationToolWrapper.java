package com.google.android.keyboard.client.delight5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ModelSxSEvaluationToolWrapper {
    private static volatile ModelSxSEvaluationToolWrapper instance;
    private final long nativePtr;
    private final iov protoUtils;
    private static final ltg logger = ltg.j("com/google/android/keyboard/client/delight5/ModelSxSEvaluationToolWrapper");
    private static final hhl oneBatchWordsToEvalModels = hhq.f("one_batch_words_to_eval_models", 10);
    private static final hhl minNumWordsToEvalModels = hhq.f("min_num_words_to_eval_models", 100);

    private ModelSxSEvaluationToolWrapper() {
        this(new iov());
    }

    private static native long createModelSxSEvaluationToolNative();

    private static native byte[] evalModelsNative(byte[] bArr, long j);

    public static ModelSxSEvaluationToolWrapper getInstance() {
        return instance;
    }

    public static ModelSxSEvaluationToolWrapper getOrCreateInstance() {
        ModelSxSEvaluationToolWrapper modelSxSEvaluationToolWrapper = instance;
        if (modelSxSEvaluationToolWrapper == null) {
            synchronized (ModelSxSEvaluationToolWrapper.class) {
                modelSxSEvaluationToolWrapper = instance;
                if (modelSxSEvaluationToolWrapper == null) {
                    modelSxSEvaluationToolWrapper = new ModelSxSEvaluationToolWrapper();
                    instance = modelSxSEvaluationToolWrapper;
                }
            }
        }
        return modelSxSEvaluationToolWrapper;
    }

    private static native void loadMainLMNative(byte[] bArr, long j);

    private static native void releaseModelSxSEvaluationToolNative(long j);

    private static native void resetModelSxSEvaluationToolNative(long j);

    public synchronized boolean compareModels(mvn mvnVar, mvn mvnVar2) {
        RuntimeException runtimeException;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int intValue = ((Long) oneBatchWordsToEvalModels.c()).intValue();
        try {
            loadMainLMNative(this.protoUtils.b(mvnVar), this.nativePtr);
            loadMainLMNative(this.protoUtils.b(mvnVar2), this.nativePtr);
            Iterator it = new ArrayList().iterator();
            nfh t = mvp.b.t();
            lfy g = lfy.g("\\s+");
            i4 = 0;
            i5 = 0;
            i6 = 0;
            while (it.hasNext()) {
                try {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((mvp) t.b).a = nfm.G();
                    while (((mvp) t.b).a.size() < intValue && it.hasNext()) {
                        List k = g.k(((String) it.next()).trim());
                        for (int i7 = 0; i7 < k.size(); i7++) {
                            String str = (String) k.get(i7);
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            mvp mvpVar = (mvp) t.b;
                            str.getClass();
                            nga ngaVar = mvpVar.a;
                            if (!ngaVar.c()) {
                                mvpVar.a = nfm.H(ngaVar);
                            }
                            mvpVar.a.add(str);
                        }
                    }
                    if (((mvp) t.b).a.size() > 0) {
                        mvq mvqVar = (mvq) this.protoUtils.a((nhf) mvq.c.N(7), evalModelsNative(((mvp) t.cz()).q(), this.nativePtr));
                        if (mvqVar != null && mvqVar.b.size() == 2) {
                            i5 += mvqVar.a;
                            i6 += ((mvr) mvqVar.b.get(0)).a;
                            i4 += ((mvr) mvqVar.b.get(1)).a;
                        }
                    }
                } catch (RuntimeException e) {
                    runtimeException = e;
                    i = i4;
                    i2 = i5;
                    i3 = i6;
                    ((ltd) ((ltd) ((ltd) logger.c()).i(runtimeException)).k("com/google/android/keyboard/client/delight5/ModelSxSEvaluationToolWrapper", "compareModels", (char) 128, "ModelSxSEvaluationToolWrapper.java")).t("Failed to compare models.");
                    i4 = i;
                    i5 = i2;
                    i6 = i3;
                    resetModelSxSEvaluationToolNative(this.nativePtr);
                    if (i5 < ((Long) minNumWordsToEvalModels.c()).intValue()) {
                    }
                }
            }
        } catch (RuntimeException e2) {
            runtimeException = e2;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        resetModelSxSEvaluationToolNative(this.nativePtr);
        return i5 < ((Long) minNumWordsToEvalModels.c()).intValue() && i4 < i6;
    }

    public ModelSxSEvaluationToolWrapper(iov iovVar) {
        this.protoUtils = iovVar;
        this.nativePtr = createModelSxSEvaluationToolNative();
    }
}
