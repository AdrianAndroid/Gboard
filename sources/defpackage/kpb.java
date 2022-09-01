package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* renamed from: kpb  reason: default package */
/* loaded from: classes.dex */
public final class kpb extends kpe implements kov {
    private final FileInputStream a;
    private final File b;

    public kpb(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.kov
    public final File a() {
        return this.b;
    }
}
