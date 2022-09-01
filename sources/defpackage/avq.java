package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: PG */
/* renamed from: avq  reason: default package */
/* loaded from: classes.dex */
public final class avq extends avg {
    public avq(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.avj
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.avg
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.avg
    protected final /* synthetic */ void e(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
