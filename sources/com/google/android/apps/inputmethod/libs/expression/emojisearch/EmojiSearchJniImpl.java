package com.google.android.apps.inputmethod.libs.expression.emojisearch;

import android.content.Context;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiSearchJniImpl implements cne {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl");
    private static volatile boolean b;
    private static volatile boolean c;
    private static List d;
    private static mwu e;

    private static void d() {
        if (jam.b || b || c) {
            return;
        }
        synchronized (cne.class) {
            c = true;
            if (!NativeLibHelper.a("emoji", false)) {
                return;
            }
            b = true;
            try {
                nativeInit();
            } catch (UnsatisfiedLinkError e2) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "loadLibrary", '>', "EmojiSearchJniImpl.java")).t("Failed to init native library.");
            }
        }
    }

    private static native void nativeInit();

    private static native void nativeLoadData(Object[] objArr);

    private static native byte[] nativeSearch(byte[] bArr);

    private static native void nativeUnloadData();

    @Override // defpackage.cne
    public final void a(Context context, List list) {
        d();
        if (!b) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "activate", 73, "EmojiSearchJniImpl.java")).t("activate() called before native library loaded.");
            return;
        }
        ArrayList arrayList = new ArrayList(((lrl) list).c);
        lta listIterator = ((llp) list).listIterator();
        while (listIterator.hasNext()) {
            Locale locale = (Locale) listIterator.next();
            File d2 = cly.a(context).d(true, locale, 1);
            if (d2 == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "activate", 85, "EmojiSearchJniImpl.java")).w("activate() called before emoji data file readied for locale %s", locale.toLanguageTag());
            } else {
                arrayList.add(d2.getAbsolutePath());
            }
        }
        try {
            nativeLoadData(arrayList.toArray(new Object[0]));
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "activate", '_', "EmojiSearchJniImpl.java")).t("Unexpected exception while loading emoji data: ");
        }
    }

    @Override // defpackage.cne
    public final void b() {
        if (!b) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "deactivate", 144, "EmojiSearchJniImpl.java")).t("deactivate called before native library loaded.");
            return;
        }
        try {
            nativeUnloadData();
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "deactivate", (char) 150, "EmojiSearchJniImpl.java")).t("Unexpected exception while unloading emoji data: ");
        }
    }

    @Override // defpackage.cne
    public final mwu c(List list) {
        mwu mwuVar;
        mwu mwuVar2;
        mwu mwuVar3 = mwu.b;
        if (!b) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "filter", 111, "EmojiSearchJniImpl.java")).t("filter() called before native library loaded.");
            return mwuVar3;
        } else if (list.equals(d) && (mwuVar2 = e) != null) {
            return mwuVar2;
        } else {
            d = list;
            nfh t = mwt.b.t();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toLowerCase(Locale.US).trim().replaceAll("\\s+", " "));
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mwt mwtVar = (mwt) t.b;
            nga ngaVar = mwtVar.a;
            if (!ngaVar.c()) {
                mwtVar.a = nfm.H(ngaVar);
            }
            ndt.cs(arrayList, mwtVar.a);
            byte[] q = ((mwt) t.cz()).q();
            if (q != null) {
                try {
                    mwuVar = (mwu) nfm.z(mwu.b, nativeSearch(q), nfb.b());
                } catch (ngd e2) {
                    ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "filter", (char) 133, "EmojiSearchJniImpl.java")).t("Failed to parse emoji search response");
                    mwuVar = null;
                }
                if (mwuVar != null) {
                    mwuVar3 = mwuVar;
                }
                e = mwuVar3;
                return mwuVar3;
            }
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/emojisearch/EmojiSearchJniImpl", "filter", 123, "EmojiSearchJniImpl.java")).t("Serializing request proto failed.");
            e = mwuVar3;
            return mwuVar3;
        }
    }
}
