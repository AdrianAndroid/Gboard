package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: lza  reason: default package */
/* loaded from: classes.dex */
public final class lza implements FilenameFilter {
    private final Pattern a;

    public lza(String str) {
        Pattern compile = Pattern.compile(str);
        jdg.u(compile);
        this.a = compile;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
