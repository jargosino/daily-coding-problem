; Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
; For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
; Bonus: Can you do this in one pass?

.model small
.386
.stack

.data
    num_list    db  10, 15, 3, 7
    num_list_len dw  $ - num_list
    k           db  17
    TRUE        equ "1"
    FALSE       equ "0"

.code

main proc
    mov ax,@data
    mov ds,ax
    mov es,ax

    mov si,0
    mov cx,num_list_len
    dec cx
    loop_out:
    push cx
        mov di,si
        inc di
        mov cx,num_list_len
        sub cx,di
        loop_inner:
        push cx
            mov al,num_list[si]
            add al,num_list[di]
            cmp al,k
            je does_add_up
            inc di
        pop cx
        loop loop_inner
        inc si
    pop cx
    loop loop_out

    does_not_add_up:
        mov ah,02h
        mov dl,FALSE
        int 21h
    jmp program_end

    does_add_up:
        mov ah,02h
        mov dl,TRUE
        int 21h

    program_end:
    mov ax,4c00h
    int 21h
main endp

end main
