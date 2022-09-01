package defpackage;

import android.content.res.Resources;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: vh  reason: default package */
/* loaded from: classes2.dex */
public final class vh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(Resources resources, int i) {
        return resources.getFloat(i);
    }

    public static final agm b(Class cls, aqr aqrVar, agn agnVar, ags agsVar) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return c("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls, aqrVar, agnVar, agsVar);
    }

    public static final agm c(String str, Class cls, aqr aqrVar, agn agnVar, ags agsVar) {
        agm a;
        agm agmVar = (agm) ((HashMap) aqrVar.a).get(str);
        if (cls.isInstance(agmVar)) {
            if (agmVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            }
            return agmVar;
        }
        ags agsVar2 = new ags(agsVar);
        agsVar2.b.put(agp.a, str);
        try {
            a = agnVar.b(cls);
        } catch (AbstractMethodError unused) {
            a = agnVar.a(cls);
        }
        agm agmVar2 = (agm) ((HashMap) aqrVar.a).put(str, a);
        if (agmVar2 != null) {
            agmVar2.c();
        }
        return a;
    }
}
