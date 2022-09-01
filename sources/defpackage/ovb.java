package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ovb  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class ovb {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final ovn a(File file) {
        oll.e(file, "<this>");
        return c(new FileOutputStream(file, true));
    }

    public static final ovn b(File file) {
        oll.e(file, "<this>");
        oll.e(file, "<this>");
        return c(new FileOutputStream(file, false));
    }

    public static final ovn c(OutputStream outputStream) {
        return new ovd(outputStream, new ovr());
    }

    public static final ovn d(Socket socket) {
        oll.e(socket, "<this>");
        ovo ovoVar = new ovo(socket);
        OutputStream outputStream = socket.getOutputStream();
        oll.d(outputStream, "getOutputStream()");
        return new oun(ovoVar, new ovd(outputStream, ovoVar));
    }

    public static final ovp e(File file) {
        oll.e(file, "<this>");
        return new ova(new FileInputStream(file), ovr.h);
    }

    public static final ovp f(InputStream inputStream) {
        oll.e(inputStream, "<this>");
        return new ova(inputStream, new ovr());
    }

    public static final ovp g(Socket socket) {
        oll.e(socket, "<this>");
        ovo ovoVar = new ovo(socket);
        InputStream inputStream = socket.getInputStream();
        oll.d(inputStream, "getInputStream()");
        return new ouo(ovoVar, new ova(inputStream, ovoVar));
    }

    public static final boolean h(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || ols.j(message, "getsockname failed", 0, 2) < 0) ? false : true;
    }
}
