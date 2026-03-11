package com.bissoli.agendador_horarios.services;

import com.bissoli.agendador_horarios.infrastructure.entity.Agendamento;
import com.bissoli.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public Agendamento save(Agendamento agendamento) {

    }
}
