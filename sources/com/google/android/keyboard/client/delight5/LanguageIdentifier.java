package com.google.android.keyboard.client.delight5;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LanguageIdentifier implements cdn {
    public static final int HINGLISH_MODEL_TYPE = 2;
    public static final int POD_MODEL_TYPE = 1;
    public static final String TAG = "LanguageIdentifier";
    private int dictionaryVersion;
    private int modelType;
    private int modelVersion;
    private long nativePtr;
    private final iov protoUtils;
    private final cdr superpacksManager;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public @interface ModelType {
    }

    public LanguageIdentifier(Context context) {
        this(context, 1, new iov(), cdr.d(context));
    }

    private void assignNativePtrNewValue(long j) {
        long j2 = this.nativePtr;
        if (j2 != 0) {
            releaseLanguageIdentifierNative(j2);
        }
        this.nativePtr = j;
    }

    private static native long createLanguageIdentifierNative(byte[] bArr);

    private static native byte[] identifyLanguageNative(byte[] bArr, long j);

    private static native byte[] identifyLanguagesNative(byte[] bArr, long j);

    private static native void releaseLanguageIdentifierNative(long j);

    private static native void setLanguageFilterNative(byte[] bArr, long j);

    private static native void unloadDictionaryNative(long j);

    private static native void unloadLangIDModelNative(long j);

    protected void finalize() {
        long j = this.nativePtr;
        if (j != 0) {
            releaseLanguageIdentifierNative(j);
            this.nativePtr = 0L;
        }
        this.superpacksManager.close();
        super.finalize();
    }

    public int getCurrentDictionaryVersion() {
        return this.dictionaryVersion;
    }

    public int getCurrentModelVersion() {
        return this.modelVersion;
    }

    public mtg identifyLanguage(msv msvVar) {
        if (this.nativePtr == 0) {
            return mtg.f;
        }
        nfh t = mtf.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtf mtfVar = (mtf) t.b;
        msvVar.getClass();
        mtfVar.b = msvVar;
        mtfVar.a |= 1;
        byte[] b = this.protoUtils.b((mtf) t.cz());
        if (b == null) {
            return mtg.f;
        }
        mtg mtgVar = (mtg) this.protoUtils.a((nhf) mtg.f.N(7), identifyLanguageNative(b, this.nativePtr));
        return mtgVar == null ? mtg.f : mtgVar;
    }

    public mtg identifyLanguages(String str) {
        if (this.nativePtr == 0) {
            return mtg.f;
        }
        nfh t = mtf.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtf mtfVar = (mtf) t.b;
        str.getClass();
        mtfVar.a |= 2;
        mtfVar.c = str;
        mtg mtgVar = (mtg) this.protoUtils.a((nhf) mtg.f.N(7), identifyLanguagesNative(((mtf) t.cz()).q(), this.nativePtr));
        return mtgVar == null ? mtg.f : mtgVar;
    }

    @Override // defpackage.cdn
    public Map identifyLanguagesAndGetMap(String str) {
        if (this.nativePtr == 0) {
            return new qo();
        }
        mth mthVar = identifyLanguages(str).d;
        if (mthVar == null) {
            mthVar = mth.c;
        }
        qo qoVar = new qo();
        for (int i = 0; i < mthVar.a.size(); i++) {
            qoVar.put((String) mthVar.a.get(i), Float.valueOf(mthVar.b.d(i)));
        }
        return qoVar;
    }

    public boolean loadDictionary(String str, boolean z) {
        File f = this.superpacksManager.f(String.valueOf(str).concat("_dictionary"), z);
        String path = f != null ? f.getPath() : null;
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (this.nativePtr != 0) {
            if (this.dictionaryVersion == this.superpacksManager.b()) {
                return true;
            }
        }
        nfh t = mto.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mto mtoVar = (mto) t.b;
        path.getClass();
        nga ngaVar = mtoVar.c;
        if (!ngaVar.c()) {
            mtoVar.c = nfm.H(ngaVar);
        }
        mtoVar.c.add(path);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mto mtoVar2 = (mto) t.b;
        str.getClass();
        nga ngaVar2 = mtoVar2.d;
        if (!ngaVar2.c()) {
            mtoVar2.d = nfm.H(ngaVar2);
        }
        mtoVar2.d.add(str);
        assignNativePtrNewValue(createLanguageIdentifierNative(((mto) t.cz()).q()));
        if (this.nativePtr == 0) {
            return false;
        }
        this.dictionaryVersion = this.superpacksManager.b();
        return true;
    }

    public boolean loadLanguageIdentifier() {
        return loadLanguageIdentifier(false);
    }

    public void maybeUnloadDictionary() {
        long j = this.nativePtr;
        if (j == 0 || this.dictionaryVersion < 0) {
            return;
        }
        unloadDictionaryNative(j);
    }

    public void maybeUnloadLangIDModel() {
        long j = this.nativePtr;
        if (j == 0 || this.modelVersion < 0) {
            return;
        }
        unloadLangIDModelNative(j);
    }

    public boolean setLanguageFilter(List list) {
        if (this.nativePtr == 0) {
            return false;
        }
        nfh t = mte.b.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mte mteVar = (mte) t.b;
        nga ngaVar = mteVar.a;
        if (!ngaVar.c()) {
            mteVar.a = nfm.H(ngaVar);
        }
        ndt.cs(list, mteVar.a);
        setLanguageFilterNative(((mte) t.cz()).q(), this.nativePtr);
        return true;
    }

    @Override // defpackage.cdn
    public boolean loadLanguageIdentifier(boolean z) {
        File f;
        File f2 = this.superpacksManager.f(this.modelType == 1 ? "pod_langid_model" : "hinglish_langid_model", z);
        String str = null;
        String path = f2 != null ? f2.getPath() : null;
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (this.nativePtr != 0) {
            if (this.modelVersion == this.superpacksManager.b()) {
                return true;
            }
        }
        nfh t = mto.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mto mtoVar = (mto) t.b;
        path.getClass();
        mtoVar.a |= 1;
        mtoVar.b = path;
        cdr cdrVar = this.superpacksManager;
        if (this.modelType == 2 && (f = cdrVar.f("hinglish_config", z)) != null) {
            str = f.getPath();
        }
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mto mtoVar2 = (mto) t.b;
            mtoVar2.a |= 4;
            mtoVar2.e = str;
        }
        assignNativePtrNewValue(createLanguageIdentifierNative(((mto) t.cz()).q()));
        if (this.nativePtr == 0) {
            return false;
        }
        this.modelVersion = this.superpacksManager.b();
        return true;
    }

    public LanguageIdentifier(Context context, int i) {
        this(context, i, new iov(), cdr.d(context));
    }

    public LanguageIdentifier(Context context, int i, iov iovVar, cdr cdrVar) {
        this.modelType = 0;
        this.nativePtr = 0L;
        this.modelVersion = -1;
        this.dictionaryVersion = -1;
        this.protoUtils = iovVar;
        this.superpacksManager = cdrVar;
        JniUtil.loadLibrary(cbd.c.b(context).getAbsolutePath());
        this.modelType = i;
    }
}
