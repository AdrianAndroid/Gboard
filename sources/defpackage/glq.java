package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* renamed from: glq  reason: default package */
/* loaded from: classes.dex */
public final class glq {
    private static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/CronetProviderFactory");
    private static final llw b = llw.n(CronetProvider.PROVIDER_NAME_APP_PACKAGED, "org.chromium.net.impl.NativeCronetProvider", "Google-Play-Services-Cronet-Provider", "com.google.android.gms.net.GmsCoreCronetProvider", CronetProvider.PROVIDER_NAME_FALLBACK, "org.chromium.net.impl.JavaCronetProvider");

    public static final CronetProvider a(Context context, String str) {
        try {
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(context)) {
                if (cronetProvider.getName().equals(str) && cronetProvider.isEnabled()) {
                    return cronetProvider;
                }
            }
            return null;
        } catch (RuntimeException unused) {
            return b(context, str);
        }
    }

    private static CronetProvider b(Context context, String str) {
        CronetProvider cronetProvider;
        String str2 = (String) b.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            cronetProvider = (CronetProvider) Class.forName(str2).getConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/gsa/io/impl/CronetProviderFactory", "createViaReflection", 78, "CronetProviderFactory.java")).w("Can't load %s", str2);
        }
        if (!cronetProvider.isEnabled()) {
            return null;
        }
        return cronetProvider;
    }
}
