package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassificationManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* renamed from: ajp  reason: default package */
/* loaded from: classes.dex */
public final class ajp {
    private static final Object c = new Object();
    private static final WeakHashMap d = new WeakHashMap();
    public final Object a = new Object();
    public final beh b;

    public ajp(Context context) {
        beh a;
        nq.g(context);
        if (Build.VERSION.SDK_INT >= 26) {
            a = new ajo(context, ((TextClassificationManager) context.getSystemService("textclassification")).getTextClassifier());
        } else {
            a = ajm.a(context);
        }
        this.b = a;
    }

    public static ajp a(Context context) {
        ajp ajpVar;
        nq.g(context);
        synchronized (c) {
            WeakHashMap weakHashMap = d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(context);
            ajpVar = weakReference != null ? (ajp) weakReference.get() : null;
            if (ajpVar == null) {
                ajpVar = new ajp(context);
                weakHashMap.put(context, new WeakReference(ajpVar));
            }
        }
        return ajpVar;
    }
}
