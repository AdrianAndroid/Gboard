package defpackage;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* renamed from: azv  reason: default package */
/* loaded from: classes.dex */
public final class azv implements azn {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public azv(AssetManager assetManager, ayq ayqVar, int i) {
        this.a = i;
        this.c = assetManager;
        this.b = ayqVar;
    }

    public azv(Resources resources, azn aznVar, int i) {
        this.a = i;
        this.c = resources;
        this.b = aznVar;
    }

    private final Uri c(Integer num) {
        try {
            String resourcePackageName = ((Resources) this.c).getResourcePackageName(num.intValue());
            String resourceTypeName = ((Resources) this.c).getResourceTypeName(num.intValue());
            String resourceEntryName = ((Resources) this.c).getResourceEntryName(num.intValue());
            return Uri.parse("android.resource://" + resourcePackageName + "/" + resourceTypeName + "/" + resourceEntryName);
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            new StringBuilder("Received invalid resource id: ").append(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ayq, java.lang.Object] */
    @Override // defpackage.azn
    public final /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        if (this.a == 0) {
            Uri c = c((Integer) obj);
            if (c != null) {
                return this.b.b(c, i, i2, avaVar);
            }
            return null;
        }
        Uri uri = (Uri) obj;
        return new fws(new bfu(uri), this.b.a((AssetManager) this.c, uri.toString().substring(22)));
    }

    @Override // defpackage.azn
    public final /* synthetic */ boolean a(Object obj) {
        if (this.a != 0) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        Integer num = (Integer) obj;
        return true;
    }
}
