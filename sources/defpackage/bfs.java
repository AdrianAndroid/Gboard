package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: bfs  reason: default package */
/* loaded from: classes.dex */
public final class bfs {
    private static final ConcurrentMap a = new ConcurrentHashMap();

    public static auw a(Context context) {
        PackageInfo packageInfo;
        String uuid;
        String packageName = context.getPackageName();
        auw auwVar = (auw) a.get(packageName);
        if (auwVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            bfu bfuVar = new bfu(uuid);
            auw auwVar2 = (auw) a.putIfAbsent(packageName, bfuVar);
            return auwVar2 == null ? bfuVar : auwVar2;
        }
        return auwVar;
    }
}
