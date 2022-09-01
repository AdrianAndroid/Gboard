package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.UserManager;

/* compiled from: PG */
/* renamed from: xa  reason: default package */
/* loaded from: classes2.dex */
public final class xa {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static Paint.Join b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 2 ? Paint.Join.ROUND : Paint.Join.BEVEL : Paint.Join.MITER;
    }

    public static int[] c() {
        return new int[]{1, 2, 3};
    }
}
