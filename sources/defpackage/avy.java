package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: avy  reason: default package */
/* loaded from: classes.dex */
public final class avy extends avg {
    public avy(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.avj
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.avg
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.avg
    protected final /* synthetic */ void e(Object obj) {
        ((InputStream) obj).close();
    }
}
