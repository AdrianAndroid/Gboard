package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ayw  reason: default package */
/* loaded from: classes.dex */
public final class ayw implements auo {
    @Override // defpackage.auo
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ava avaVar) {
        try {
            bfw.e((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
