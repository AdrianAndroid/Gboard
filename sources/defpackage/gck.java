package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: gck  reason: default package */
/* loaded from: classes.dex */
public final class gck {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gck(Context context, List list, fwo fwoVar, fwe fweVar, jns jnsVar) {
        this.e = context;
        this.a = list;
        this.b = fwoVar;
        this.c = fweVar;
        this.d = jnsVar;
    }

    public gck(Drawable.Callback callback) {
        this.c = new apc();
        this.a = new HashMap();
        this.d = new HashMap();
        this.b = ".ttf";
        if (!(callback instanceof View)) {
            asa.a("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
            return;
        }
        this.e = ((View) callback).getContext().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f9, code lost:
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cf, code lost:
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [fwe] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v25, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v29, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v49, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r14v1, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, fwo] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [gar] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.String r13, defpackage.fzf r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gck.a(java.lang.String, fzf, byte[]):int");
    }

    public final int b() {
        return ((AtomicInteger) this.d).get();
    }

    public final File c() {
        String valueOf = String.valueOf(((Context) this.e).getFilesDir());
        String str = File.separator;
        File file = new File(valueOf + str + "langid");
        if (!jan.b.h(file)) {
            return null;
        }
        String obj = file.toString();
        String str2 = File.separator;
        return new File(obj + str2 + "state.data");
    }

    public gck(String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.c = strArr;
        this.a = new boolean[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            ((boolean[]) this.a)[i] = strArr[i].contains(str);
        }
        this.d = strArr2;
        this.e = strArr3;
        this.b = strArr4;
    }

    public gck(Context context) {
        ieh j = ieh.j();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.a = new AtomicLong();
        this.e = context;
        this.c = j;
        this.b = concurrentHashMap;
    }

    public gck(imn imnVar, gqy gqyVar, gqh gqhVar, View view, Animator animator) {
        this.c = gqyVar;
        this.a = gqhVar;
        this.e = view;
        this.d = new gti(gqyVar, view, animator);
        this.b = new gsv(imnVar);
    }
}
