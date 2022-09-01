package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;

/* compiled from: PG */
/* renamed from: mml  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class mml implements mon {
    private final /* synthetic */ int e;
    public static final /* synthetic */ mml d = new mml(3);
    public static final /* synthetic */ mml c = new mml(2);
    public static final /* synthetic */ mml b = new mml(1);
    public static final /* synthetic */ mml a = new mml(0);

    private /* synthetic */ mml(int i) {
        this.e = i;
    }

    @Override // defpackage.mon
    public final String a(Object obj) {
        int i = this.e;
        if (i == 0) {
            ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
            return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
        } else if (i == 1) {
            ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
            return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
        } else if (i == 2) {
            Context context = (Context) obj;
            return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        } else {
            Context context2 = (Context) obj;
            String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
            return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }
}
