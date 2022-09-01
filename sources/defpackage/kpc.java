package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* renamed from: kpc  reason: default package */
/* loaded from: classes.dex */
public final class kpc extends kpf implements kov {
    public final FileOutputStream a;
    private final File b;

    public kpc(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.kov
    public final File a() {
        return this.b;
    }
}
