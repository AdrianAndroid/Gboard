package defpackage;

import android.os.UserHandle;
import android.os.UserManager;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: nvp  reason: default package */
/* loaded from: classes2.dex */
public final class nvp implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nvp(UserManager userManager, int i) {
        this.b = i;
        this.a = userManager;
    }

    public nvp(nvq nvqVar, int i) {
        this.b = i;
        this.a = nvqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [nvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nvq, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.b == 0) {
            this.a.a(obj);
            this.a.a(obj2);
            return obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
        UserManager userManager = (UserManager) this.a;
        return (int) (userManager.getSerialNumberForUser((UserHandle) obj) - userManager.getSerialNumberForUser((UserHandle) obj2));
    }
}
