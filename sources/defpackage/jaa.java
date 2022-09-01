package defpackage;

import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jaa  reason: default package */
/* loaded from: classes.dex */
public final class jaa extends iye {
    final /* synthetic */ jab a;

    public jaa(jab jabVar) {
        this.a = jabVar;
    }

    @Override // defpackage.iye
    public final void a() {
        if (this.a.b != null) {
            ((ltd) ((ltd) jab.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/guarder/UFCGuarder$1", "onClearUserData", 33, "UFCGuarder.java")).t("onClearUserData");
            UserFeatureCache userFeatureCache = (UserFeatureCache) igr.d(this.a.b).b(jac.class);
            if (userFeatureCache == null) {
                ((ltd) ((ltd) jab.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/guarder/UFCGuarder$1", "onClearUserData", 38, "UFCGuarder.java")).t("User feature cache is not initialized so clean-up will start it.");
                userFeatureCache = new UserFeatureCache(this.a.b);
                userFeatureCache.c();
            }
            userFeatureCache.g();
            userFeatureCache.f();
            ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "cleanUp", 111, "UserFeatureCache.java")).t("cleanUp synchronously.");
            for (Map.Entry entry : userFeatureCache.c.entrySet()) {
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "cleanUp", 114, "UserFeatureCache.java")).v("cleanUp feature id: %d", ((Long) entry.getKey()).longValue());
                userFeatureCache.putSerializedData(((Long) entry.getKey()).longValue(), gvw.a);
            }
        }
    }
}
