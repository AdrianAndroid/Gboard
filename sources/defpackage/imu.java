package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: imu  reason: default package */
/* loaded from: classes.dex */
public class imu extends imt {
    private static final String[] c = {"androidx.preference."};

    public imu(Context context) {
        super(context, c);
    }

    @Override // defpackage.imt
    public final /* synthetic */ Bundle a(Object obj) {
        return ((Preference) obj).r();
    }

    @Override // defpackage.imt
    protected final /* synthetic */ void d(Object obj, Intent intent) {
        ((Preference) obj).u = intent;
    }
}
